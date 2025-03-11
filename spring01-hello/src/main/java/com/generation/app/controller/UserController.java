package com.generation.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



/**
 *  Aplicando el patrón MVC
 *  Generar un controlar que mapee el siguiente path
 *  
 *  GET /api/v1/users
 *  Salida: mostrar la vista Bienvenid@ usuario
 *  
 *  Opcional:
 *  Solicitar dos path params
 *   - name
 *   - cohorte
 *  salida: Bienvenid@ Queso Asado de la Ch 50
 *  salida: Bienvenid@ Carlos de la Ch 51
 *  
 * 
 */
@Controller
public class UserController {
	
	@GetMapping("/api/v1/users") 
	//localhost:8081/api/v1/users/nombre=kati&cohorte=Ch50
	public String greetingWithUser(
			Model model, 
			
			@RequestParam(name = "nombre", 
			required = false, 
			defaultValue = "Usuario Anónimo") String nombre,
			
            @RequestParam(name = "cohorte", 
            required = false, 
            defaultValue = "Sin cohorte") String cohorte) {
		
		
        model.addAttribute("name", nombre);
        model.addAttribute("cohorte", cohorte);
		return "saludo-cohorte";
	}

}
