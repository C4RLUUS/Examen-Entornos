package hola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LibroTest {



	@Test
	@DisplayName(value = "titulo = La isla del Tesoro  isbn =978-84-207-1225-3 = true" )
	void testCheckISBN13() {
		Libro l1 = new Libro("La isla del tesoro", "9788420712253", "Robert L. Stevenson", "Anaya");
		assertTrue(l1.checkISBN13());
		
	}
	 
	@Test
	@DisplayName(value = "titulo = La isla del Tesoro  isbn =978-84-207-1225-34 = false, 14 caracteres en isbn" )
	void testCheckISBN132() {
		Libro l1 = new Libro("La isla del tesoro", "97884207122534", "Robert L. Stevenson", "Anaya");
		assertFalse(l1.checkISBN13());
		
	}
	 
}
