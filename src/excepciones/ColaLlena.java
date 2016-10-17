
package excepciones;

/**
 *
 * @author Claudio
 */
public class ColaLlena extends Exception {

    public ColaLlena() {
        super("La cola esta llena");
    }

    public ColaLlena(String message) {
        super(message);
    }
    
}
