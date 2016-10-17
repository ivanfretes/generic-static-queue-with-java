
package excepciones;

/**
 *
 * @author Claudio
 */
public class ListaVacia extends Exception {

    public ListaVacia() {
        super("La lista esta vacia");
    }

    public ListaVacia(String message) {
        super(message);
    }
    
}
