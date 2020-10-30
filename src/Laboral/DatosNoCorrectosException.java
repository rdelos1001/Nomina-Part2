package Laboral;
/**
 * Esta excepción salta cuando los datos recibidos no son correctos.
 * @author Raúl
 *
 */
public class DatosNoCorrectosException extends Exception {
    public DatosNoCorrectosException() {
        super("Datos no correctos");
    }
}