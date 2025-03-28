package org.generation.app.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**	
 * 
 * Ejercicio Casi Palíndromo
 * 
 * Verificar si una palabra es casi palíndromo,
 * con el cambio de una sola letra.
 * 
 * La función debe aceptar un texto y retornar
 * con true si la palabra es casi palíndromo,
 * de lo contrario retornar false.
 * 
 * Ej.
 *  Oso -> false ( por que ya es un palíndromo)
 *  Ver -> true (si reemplazo la v por r -> vev)
 *  Hola -> false (no es casi un palíndromio: holh, hooa)
 *  Ocho -> true ( occo)
 *  Veronica -> false ( veronicv, veroniea, veronrca, verooica)
 *  Anita lavó la tina - > true (  Anita L[a]v[a] la tina )
 * 
 */
public class PalindromeTest {

    Palindrome palindrome;
    
    @BeforeEach
    void init() {
    	palindrome = new Palindrome();
    }
    
    @Test
	void palindromeTest() {
		assertEquals( true, palindrome.isPalindrome("Oso"));
		assertEquals( false, palindrome.isPalindrome("Ver"));
		assertEquals( false, palindrome.isPalindrome("Hola"));
		assertEquals( false, palindrome.isPalindrome("Ocho"));
		assertEquals( false, palindrome.isPalindrome("Veronica"));
		assertEquals( true, palindrome.isPalindrome("Anita lava la tina"));
	}
    
    /**	
     * 
     * Ejercicio Casi Palíndromo
     * 
     * Verificar si una palabra es casi palíndromo,
     * con el cambio de una sola letra.
     * 
     * La función debe aceptar un texto y retornar
     * con true si la palabra es casi palíndromo,
     * de lo contrario retornar false.
     * 
     * Ej.
     *  Oso -> false ( por que ya es un palíndromo)
     *  Ver -> true (si reemplazo la v por r -> vev)
     *  Hola -> false (no es casi un palíndromio: holh, hooa)
     *  Ocho -> true ( occo)
     *  Veronica -> false ( veronicv, veroniea, veronrca, verooica)
     *  Anita lavó la tina - > true (  Anita L[a]v[a] la tina )
     * 
     */
	@Test
	void almostPalindromeTest() {
		assertEquals( false, palindrome.isAlmostPalindrome("Oso"), "Verifica Oso"   );
		assertEquals( true, palindrome.isAlmostPalindrome("Ver"), "Verifica Ver"   );
		assertEquals( false, palindrome.isAlmostPalindrome("Hola"), "Verifica Hola"   );
		assertEquals( true, palindrome.isAlmostPalindrome("Ocho"), "Verifica Ocho"   );
		assertEquals( false, palindrome.isAlmostPalindrome("Veronica"), "Verifica Veronica"   );
		assertEquals( true, palindrome.isAlmostPalindrome("Anita lavó la tina"), "Verifica Anita"   );
	}

}
