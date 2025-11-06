/**
 * Clase Main del proyecto SalonHabana
 * @author Cristina García Quintero
 */
import GUI.VentanaPrincipal;

public class Main {
    public static void main (String [] args){
        java.awt.EventQueue.invokeLater(() -> new VentanaPrincipal().setVisible(true));
        
    }
    
}
