
package excepciones;

/**
 *
 * @author Claudio
 */
public class ColaVacia extends Exception {

    public ColaVacia() {
        super("La cola esta vacia");
    }

    public ColaVacia(String message) {
        super(message);
    }
    
}
