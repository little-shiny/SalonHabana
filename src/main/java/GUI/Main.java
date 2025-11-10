package GUI;

/**
 * Clase GUI.Main de nuestra aplicación. Inicia el método que arranca la interfaz gráfica
 * @author Cristina García Quintero
 */
public class Main {
    /**
     * Método principal del programa
     * @param args
     */
    public static void main (String [] args) {
        java.awt.EventQueue.invokeLater(() -> new VentanaPrincipal().setVisible(true));
    }
}
