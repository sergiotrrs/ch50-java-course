package org.generation.app.controller;

import java.util.List;

import org.generation.app.model.User;
import org.generation.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *  Una API REST, o Interfaz de Programación de Aplicaciones Representacional 
 *  por sus siglas en inglés (Representational State Transfer), 
 *  es un conjunto de reglas y convenciones para construir 
 *  servicios web que permiten la comunicación entre sistemas 
 *  de software a través del protocolo HTTP de manera simple y eficiente.
 *  
 *  Beneficios: Permite que sistemas desarrollados en diferentes 
 *  lenguajes de programación y ejecutados en diferentes 
 *  plataformas puedan comunicarse entre sí.
 *  
 *  @Controller indica que la clase será un controlador MVC
 *  (Model-View-Controller). Esta clase se encarga de manejar
 *  las solicitudes HTTP y devuelve una respuesta(Vista).
 *  
 *  @ResponseBody indica que los métodos devuelven la respuesta 
 *  en el cuerpo de la respuesta HTTP. Los objetos devueltos 
 *  por los métodos se serializan automáticamente
 *  en el formato deseado. Por default la respuesta es en JSON.
 *  
 *  @RestController indica que la clase será un controlador API REST
 *  Esta anotación combina @Controller y @ResponseBody
 * 
 *  @RequestMapping mapea una solicitud HTTP en la URL indicada.
 *  Se puede aplicar a nivel de clase o método.
 *  A nivel de clase define el prefijo común de la URL para todas
 *  las rutas de los métodos.
 *  
 *  @CrossOrigin(origins = "*") en Spring Boot se utiliza para 
 *  habilitar el CORS (Cross-Origin Resource Sharing), lo que 
 *  permite que tu aplicación acepte solicitudes desde cualquier 
 *  origen externo.
 *  
 */

// @Controller
// @ResponseBody
@RestController // @Controller + @ResponseBody
// @CrossOrigin( origins = "*" )
@CrossOrigin( origins = {"https://petcalli.netlify.app", "http://localhost:3000"})
public class UserController {
	
	// Se inyecta un objeto compatible con UserService
	// en este caso, se inyectaría el objeto de UserServiceImplList
	@Autowired
	UserService userService; 
	
	@GetMapping("/api/v1/users")
	List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	/**
	 * La anotación @RequestBody en Spring MVC se utiliza para 
	 * vincular automáticamente el cuerpo de una solicitud HTTP 
	 * a un objeto en un método de controlador. Esta anotación 
	 * permite que los datos JSON (o XML) enviados en el cuerpo 
	 * de la solicitud se deserialicen y se conviertan en una 
	 * instancia de una clase Java que se puede utilizar en el 
	 * método del controlador.
	 * 
	 * La clase ResponseEntity en Spring es una estructura 
	 * para definir y controlar la respuesta HTTP de un controlador 
	 * REST. Te permite personalizar aspectos como el código de 
	 * estado HTTP, los encabezados y el cuerpo de la respuesta.
	 * 
	 */
	@PostMapping("/api/v1/users")
	User createUser(@RequestBody User user) {
		return userService.addUser( user );
	}
	
	

}
