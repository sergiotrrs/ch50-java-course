package com.ecommerce.app.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

/**
 * @Entity se usa para marcar una clase como una entidad que se puede persistir
 *         en una base de datos relacional.
 * 
 *         Se indica a JPA que la clase representa una tabla en la base de datos
 *         y que los objetos de esta clase puedan ser almacenados, actualizados
 *         o eliminados en dicha tabla. Además, cada instancia se la clase se
 *         considera una fila en la tabla.
 */
@Entity
@Table(name = "customers")
public class Customer {

	@Id // El atributo será la clave primaria
	// Indica como se generará automáticamente las claves primarias
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "first_name", length = 100, nullable = false)
	private String firstName;
	@Column(name = "last_name", length = 100, nullable = true)
	private String lastName;
	@Column(name = "email", length = 50, nullable = false, unique = true)
	private String email;
	@Column(name = "password", length = 100, nullable = true)
	private String password;
	@Column(name = "active")
	private boolean active;
	@Column(name = "birthdate")
	private LocalDate birthDate;
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	
    /**
     * Define una relación muchos a muchos entre la entidad 
     * Customer y la entidad Role.
     * Un cliente puede tener múltiples roles y un rol puede 
     * pertenecer a múltiples clientes.
     * 
     * La relación se gestiona mediante una tabla intermedia 
     * llamada "customer_has_role".
     * - La columna "customer_id" en la tabla intermedia 
     *   referencia a la entidad Customer.
     * - La columna "role_id" en la tabla intermedia 
     *   referencia a la entidad Role.
     */
	@ManyToMany(fetch = FetchType.EAGER) // Indica la relación entre tablas
	@JoinTable( // Define la tabla intermedia
			name="customer_has_role", // nombre de tabla intermedia
			joinColumns = @JoinColumn(name = "customer_id"),
			inverseJoinColumns = @JoinColumn(name = "role_id")			
			)
	private Set<Role> roles; // Colecciones de roles de un cliente

	Customer() {
	}
		
	public Customer(String firstName, String lastName, String email, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
		
	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [id=");
		builder.append(id);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", email=");
		builder.append(email);
		builder.append(", password=");
		builder.append(password);
		builder.append(", active=");
		builder.append(active);
		builder.append(", birthDate=");
		builder.append(birthDate);
		builder.append(", createdAt=");
		builder.append(createdAt);
		builder.append("]");
		return builder.toString();
	}

}

/*
 * GenerationType.AUTO: Esta estrategia le permite al proveedor de JPA elegir
 * automáticamente la estrategia de generación más adecuada según la base de
 * datos y la configuración. El comportamiento exacto puede variar dependiendo
 * del proveedor utilizado.
 * 
 * GenerationType.IDENTITY: Esta estrategia utiliza una columna de identidad de
 * la base de datos para generar automáticamente los valores de la clave
 * primaria. Es compatible con bases de datos como MySQL que admiten columnas de
 * autoincremento. En este caso, la base de datos se encarga de generar y
 * asignar el valor de la clave primaria.
 * 
 * GenerationType.SEQUENCE: Esta estrategia utiliza una secuencia de la base de
 * datos para generar automáticamente los valores de la clave primaria. Se
 * requiere que la base de datos admita secuencias. El proveedor de JPA utiliza
 * la secuencia definida en la base de datos para obtener los valores de la
 * clave primaria.
 * 
 * GenerationType.TABLE: Esta estrategia utiliza una tabla especial en la base
 * de datos para generar los valores de la clave primaria. Se crea una tabla
 * separada que registra los valores generados para cada entidad. El proveedor
 * de JPA consulta esta tabla para obtener el próximo valor de la clave
 * primaria.
 * 
 * GenerationType.UUID: Esta estrategia genera un UUID versión 4. Se basa 
 * en números aleatorios y no en atributos del sistema (como timestamps).
 * 
 */
