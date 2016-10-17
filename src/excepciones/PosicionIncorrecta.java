
package excepciones;

public class PosicionIncorrecta extends Exception {

    public PosicionIncorrecta() {
        super("La posicion es incorrecta");
    }

    public PosicionIncorrecta(String message) {
        super(message);
    }
    
}
