package ValidateEntry;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase que maneja la validación de los datos que introduce el usuario en un JTextField
 *
 * @author Cristina García
 */
public class ValidateEntry {
    String datoValidar;

    /**
     * Constructor genérico
     */
    public ValidateEntry() {
        this.datoValidar = "";
    }

    /**
     * Metodo que evalúa si la expresión es un nombre
     *
     * @param datoValidar Expresión
     * @return True si coincide con el pattern establecido
     */
    public boolean esNombre(String datoValidar) {
        String regex = "^([a-zA-Z]{2,}\\s[a-zA-Z]{1,}'?-?[a-zA-Z]{2,}\\s?([a-zA-Z]{1,})?)";
        Pattern pattern = Pattern.compile(regex);

        return matcher.matches();
    }
    //TODO
    /**
     * Metodo que evalúa si la expresión es un teléfono
     *
     * @param datoValidar Expresión
     * @return True si coincide con el pattern establecido
     */
    public boolean esNombre(String datoValidar) {
        String regex = "^([a-zA-Z]{2,}\\s[a-zA-Z]{1,}'?-?[a-zA-Z]{2,}\\s?([a-zA-Z]{1,})?)";
        Pattern pattern = Pattern.compile(regex);

        return matcher.matches();
    }


}