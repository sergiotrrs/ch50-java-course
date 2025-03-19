package com.ecommerce.app.service.impl;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ecommerce.app.exception.MyCustomUncheckedException;
import com.ecommerce.app.model.Customer;
import com.ecommerce.app.model.Role;
import com.ecommerce.app.repository.CustomerRepository;
import com.ecommerce.app.service.CustomerService;
import com.ecommerce.app.service.RoleService;

/**
 * La inyección de dependencias es un patrón de diseño que permite la creación
 * de objetos y la gestión de sus dependencias de manera automática.
 * 
 * En lugar de crear los objetos directamente, la inyección de dependencias se
 * encarga de proporcionar las dependencias necesarias a través de un contenedor
 * de inversión de control.
 * 
 * La responsabilidad de crear y administrar los objetos se delega la contenedor
 * de Spring.
 * 
 * @Component es una anotación genérica que se utiliza para indicar que la clase
 *            es componente de Spring y debe ser gestionada por el contenedor de
 *            inversión de control (IoC).
 * 
 * @Component se aplica a una clase para que Spring la detecte automáticamente y
 *            la registre como un bean en el contexto de la aplicación.
 * 
 *            Alternativas más específicas:
 * @Service → Para lógica de negocio.
 * @Repository → Para acceso a datos.
 * @Controller / @RestController → Para controladores web.
 * 
 * @Qualifer se usa para resolver ambiguedades cuando hay varios objetos(beans)
 *           del mismo tipo en el contexto de la aplicación y se necesita
 *           especificar el bean que se debe inyectar.
 * 
 *           Bean: Es un objeto administrado por el contenedor de Spring.
 */
@Service
public class CustomerServiceImpl implements CustomerService {
	
	private final CustomerRepository customerRepository;
	private final RoleService roleService;
	private final PasswordEncoder passwordEncoder;
	
	/**
	 * En spring Boot se puede inyectar dependencia s de dos formas:
	 * 1.- Anotando un atributo con @Autowired
	 *   Desventaja: Difícil de testear y no permite la inmutabilidad.
	 * 2.- Inyección por constructor. Si hay un solo constructor 
	 *   usar Autowired es opcional.
	 *   Ventajas: Facilita la prueba unitaria y permite objetos inmutables.
	 */
	public CustomerServiceImpl(CustomerRepository customerRepository, RoleService roleService,
			PasswordEncoder passwordEncoder) {
		this.customerRepository = customerRepository;
		this.roleService = roleService;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public Customer createCustomer(Customer customer) {
		Optional<Customer> optionalCustomer = customerRepository.findByEmail(customer.getEmail());
		if( optionalCustomer.isPresent()) {
			//throw new IllegalStateException("Customer already exist with email " + customer.getEmail());
			throw new MyCustomUncheckedException("Customer already exist with email " + customer.getEmail());
		}
		// TODO Verificar si los atributos son válidos
		customer.setId(null); // forzar la creación del cliente	
		customer.setActive(true); // activar cliente
		customer.setCreatedAt(LocalDateTime.now());
		// TODO encriptar el password
		customer.setPassword( passwordEncoder.encode( customer.getPassword() ) );
		Customer newCustomer = customerRepository.save( customer );
		return newCustomer;
	}
	
	@Override
	public Customer createCustomer(Customer customer, String roleName) {
		Role role = roleService.getRoleByName(roleName);
		customer.setRoles( Set.of(role) );
		return createCustomer( customer );
	}

	@Override
	public Customer getCustomerById(Long id) {
		Optional<Customer> optionalCustomer = customerRepository.findById(id);
		if( optionalCustomer.isEmpty() || !optionalCustomer.get().isActive() ) {
			throw new IllegalStateException("Customer does not exist with id " + id);
		}
		Customer existingCustomer = optionalCustomer.get();
		return existingCustomer;
	}

	@Override
	public Customer getCustomerByEmail(String email) {
		Optional<Customer> optionalCustomer = customerRepository.findByEmail(email);
		if( optionalCustomer.isEmpty()) {
			throw new IllegalStateException("Customer does not exist with email " + email);
		}
		return optionalCustomer.get();
	}

	@Override
	public Page<Customer> getAllUsers(boolean isActive, int pageNumber, int pageSize) {
		Page<Customer> customers;
		PageRequest pageAndSize = PageRequest.of(pageNumber, pageSize);
		if( isActive ) {
			customers = customerRepository.findAllByActiveTrue(pageAndSize);
		} else {
			customers = customerRepository.findAllByActiveFalse(pageAndSize);
		}
		return customers;
	}

	@Override
	public Customer updateCustomer(Customer customer, Long id) {
		// TODO verificar los nuevos atributos a cambiar
		Customer existingCustomer = getCustomerById(id);
		existingCustomer.setFirstName( customer.getFirstName() );
		existingCustomer.setLastName( customer.getLastName() );
		existingCustomer.setBirthDate( customer.getBirthDate() );
		existingCustomer.setPassword( customer.getPassword() );
		// TODO modificar los roles en caso de ser necesario
		// ID y email no se permite modificar
		return customerRepository.save(existingCustomer);
	}

	@Override
	public void deleteCustomer(Long id) {
		Customer existingCustomer = getCustomerById(id);
		// customerRepository.delete(existingCustomer);
		// En lugar de eliminarlo se desactiva al usuario
		existingCustomer.setActive(false); 
		customerRepository.save(existingCustomer);
	}

}
