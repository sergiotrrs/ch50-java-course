package com.ecommerce.app.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

/**
 * Permite manejar excepciones de manera global en toda la aplicación, evitando
 * duplicar código en múltiples controladores.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	// Inyección de dependencia para manejar detalles del error
	private final ErrorDetails errorDetails;

	public GlobalExceptionHandler(ErrorDetails errorDetails) {
		this.errorDetails = errorDetails;
	}

	/**
	 * Maneja excepciones de tipo IllegalStateException
	 * 
	 * @param exception  Captura la excepción lanzada en la aplicación, permitiendo
	 *                   obtener detalles como el mensaje de error.
	 * @param webRequest Proporciona información sobre la solicitud HTTP, incluyendo
	 *                   la URL y otros detalles útiles para el manejo de errores.
	 * @return
	 */
	@ExceptionHandler(IllegalStateException.class)
	ResponseEntity<ErrorDetails> handleIllegalStateException(Exception exception, WebRequest webRequest) {
		errorDetails.setTimestamp(LocalDateTime.now());  // Fecha y hora del error
		errorDetails.setMessage(exception.getMessage()); // Mensaje de la excepción
		errorDetails.setPath(webRequest.getDescription(false)); // Ruta de la petición
		errorDetails.setErrorCode("Resource not found"); // Código de error personalizado

		 // Retorna una respuesta con estado 404 (NOT FOUND)
		return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(MyCustomUncheckedException.class)
	ResponseEntity<ErrorDetails> handleMyCustomUncheckedException(Exception exception, WebRequest webRequest) {
		errorDetails.setTimestamp(LocalDateTime.now()); 
		errorDetails.setMessage(exception.getMessage()); 
		errorDetails.setPath(webRequest.getDescription(false));
		errorDetails.setErrorCode("Invalid request data"); 

		return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.BAD_REQUEST);
	}
	
	/**
	 * Captura cualquier excepción no manejada.
	 * Para evitar que detalles sensibles se filtren al usuario.
	 */
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handleGenericException(Exception exception, WebRequest webRequest) {
	    errorDetails.setTimestamp(LocalDateTime.now());
	    errorDetails.setMessage(exception.getMessage());
	    errorDetails.setPath(webRequest.getDescription(false));
	    errorDetails.setErrorCode("Internal Server Error ^^' ");

	    return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR); // Status code 500
	}

}