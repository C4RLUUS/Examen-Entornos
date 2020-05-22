package hola;
/**
 * 
 * @author Carlos Lorenzo Utrero
 * @version 1.0.
 *
 */
public class Libro {
    String titulo;
	String ISBN;
    String autor;
    String editorial;

    public Libro(String titulo, String ISBN, String autor, String editorial)
        
    {
    	this.titulo = titulo;
        this.ISBN = ISBN;
        this.autor = autor;
        this.editorial = editorial;
    }
    /**
     * Este metodo comprueba un isbn de 10
     * @return devulve un boolean, true si cumple con los 10 caracteres y false si no lo cumple 
     */
    public boolean checkISBN10() {
    	boolean result = false;
    	int calculo = 0;
    	int dc = 0;
    	if (this.ISBN.length() == 10) {
    		for(int i=0;i<9;i++) {
    			int pos = Integer.parseUnsignedInt(String.valueOf(this.ISBN.charAt(i)));
    			calculo += pos*(i+1);
    		}
    		
    		if (this.ISBN.charAt(9) == 'X')
    			dc = 10;
    		else
    			dc = Integer.parseUnsignedInt(String.valueOf(this.ISBN.charAt(9)));
    
    		if (calculo%11 == dc)
    			result = true;
    	}
    	
    	return result;
    }
    /**
     * Este metodo comprueba un isbn de  10 caracteres
     * @return devulve true si el isbn cumple con los 13 caracteres en el isbn y false si no cumple con los caracteres
     */
    public boolean checkISBN13() {
    	boolean result = false;
    	int pares = 0;
    	int impares = 0;
    	
    	if (this.ISBN.length() == 13) {
    		for(int i=0;i<13;i++) {
    			int pos = Integer.parseUnsignedInt(String.valueOf(this.ISBN.charAt(i)));
    			if ((i+1)%2 == 0)
    				pares += pos;
    			else
    				impares += pos;
    		
    		}
    		
    		if ((impares + 3*pares)%10 == 0)
    			result = true;
    	}
    	
    	return result;
    }
    
}