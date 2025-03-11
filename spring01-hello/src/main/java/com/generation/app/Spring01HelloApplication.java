package com.generation.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
Spring es un framework para aplicaciones Java que facilita 
el desarrollo con características como inyección de 
dependencias y soporte para diversas tecnologías 
(JPA, JDBC, seguridad, etc.).

Spring Boot es una extensión de Spring que simplifica 
la configuración y el despliegue de aplicaciones, 
proporcionando:

- Configuración automática (Spring Boot Starter).
- Servidor embebido (Tomcat, Jetty, Undertow).
- Dependencias preconfiguradas (Spring Boot Starters).
- Facilidad para crear microservicios.
- Spring Boot permite desarrollar aplicaciones 
  listas para producción con menos configuración manual.
*/

/**
 * La anotación @SpringBootApplication se utiliza en las aplicaciones 
 * Spring Boot y es esencial para configurar y lanzar una aplicación 
 * de manera automática. 
 * 
 * Esta anotación es un atajo que combina tres anotaciones clave de Spring: 
 * @SpringBootConfiguration: Marca la clase como una configuración de Spring, 
 * similar a @Configuration.
 * @EnableAutoConfiguration: Le dice a Spring Boot que configure automáticamente
 * los beans y las dependencias necesarias según las bibliotecas presentes 
 * en el classpath.
 * @ComponentScan: Permite buscar y registrar automáticamente los componentes
 * (como @Controller, @Service, etc.) en el paquete y sus subpaquetes.
 */
@SpringBootApplication
public class Spring01HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring01HelloApplication.class, args);
	}

}
