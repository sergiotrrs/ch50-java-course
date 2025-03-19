package com.ecommerce.app.exception;

/**
 *  Las excepciones personalizadas se utilizan para 
 *  representar errores específicos de una aplicación, 
 *  en lugar de depender solo de excepciones genéricas.
 *  
 *  Las excepciones personalizadas que heredan de RunTimeException
 *  se usa cuando el error ocurre por una condición inesperada 
 *  del programa y no debería obligar al desarrollador 
 *  a manejarlo con try-catch.
 *  
 *  Ideal para errores de lógica del negocio o validaciones, 
 *  donde la ejecución no puede continuar correctamente
 *  
 *  Casos comunes de RuntimeException:
 *  
 *  > Errores de validación (InvalidInputException)
 *  > Datos no encontrados (UserNotFoundException)
 *  > Acciones no permitidas (UnauthorizedAccessException)
 *  
 *  Ventajas:
 *  - Permiten definir nombres específicos (UserNotFoundException, 
 *  InvalidTransactionException), facilitando la comprensión del error.
 *  
 *  - Pueden incluir información adicional como códigos de error o 
 *  detalles del contexto.
 *  
 *  Desventajas:
 *  - Crear demasiadas excepciones puede hacer que el código sea 
 *  más difícil de mantener.
 *  
 *  - Si no se documentan bien, los desarrolladores pueden usarlas 
 *  de forma incorrecta o ignorarlas.
 *  
 */
public class MyCustomUncheckedException extends RuntimeException  {

	// ID de versión para la serialización
	private static final long serialVersionUID = 1L;

	public MyCustomUncheckedException(String message) {
		super(message);
	}		
	
}
