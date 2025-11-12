package ValidateEntry;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase que maneja la validación de los datos que introduce el usuario en un
 * JTextField Es una clase de utilidad que no necesita ser instanciada y no
 * necesiota constructor. Lo pongo en privado
 *
 * @author Cristina García
 *
 */
public class ValidateEntry {

    /**
     * Constructor genérico privado
     */
    private ValidateEntry() {
    }

    /**
     * Metodo que evalúa si la expresión es un nombre
     *
     * @param datoValidar Expresión
     * @return True si coincide con el pattern establecido
     */
    public static boolean esNombre(String datoValidar) {
        String regex = "^[a-zA-Z \\-\\.\\']*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(datoValidar);

        return matcher.matches();
    }

    /**
     * Metodo que evalúa si la expresión es un teléfono (9 cifras sin espacios)
     *
     * @param datoValidar Expresión
     * @return True si coincide con el pattern establecido
     */
    public static boolean esTelefono(String datoValidar) {
        String regex = "\\d{9}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(datoValidar);

        return matcher.matches();
    }
}
