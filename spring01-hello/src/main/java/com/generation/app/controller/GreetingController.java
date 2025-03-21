package com.generation.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *  @Controller indica que la clase será un controlador MVC
 *  (Model-View-Controller). Esta clase se encarga de manejar
 *  las solicitudes HTTP y devuelve una respuesta(Vista).
 */
@Controller
public class GreetingController {
	
	@GetMapping("/greeting")
	public String greeting() {
		return "saludo";
	}
	
	/**
	 * 
	 * @param model usado para llevar datos desde el backend
	 *  a la vista Thymeleaf
	 * @return la vista generada
	 */
	@GetMapping("/greeting-v2") // localhost:8080/greeting-v2?nombre=serch&cohorte=50
	public String greetingWithUserName(
			Model model, 
			@RequestParam(
					name="nombre", 
					required=false, 
					defaultValue="Super Ch50") String nombre
			) {
		// Agrega un atributo llamado name con el valor Super Ch50
		model.addAttribute("name", nombre);
		model.addAttribute("cohorte", "Ch50");
		return "saludo-personalizado";
	}

}
