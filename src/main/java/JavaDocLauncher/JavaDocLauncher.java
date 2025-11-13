package JavaDocLauncher;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 * Clase para generar un ejecutable que permita abrir el JavaDoc del proyecto sin que el usuario tenga que navegar
 * por las carpetas
 *
 * @author Cristina García
 */

public class JavaDocLauncher {
    public static void main(String[] args) {
        // Detecta el directorio actual (src/main/java)
        File currentDir = new File(System.getProperty("user.dir"));

        // Sube tres niveles: /src/main/java → /src/main → /src → / (raíz del proyecto)
        File projectRoot = currentDir.getParentFile().getParentFile().getParentFile();

        // Ruta donde Maven guarda el javadoc
        File javadocFile = new File(projectRoot, "target/site/apidocs/index.html");

        if (!javadocFile.exists()) {
            System.err.println("No se encontró el archivo JavaDoc: " + javadocFile.getAbsolutePath());
            return;
        }

        try {
            System.out.println("Abriendo Javadoc: " + javadocFile.getAbsolutePath());
            Desktop.getDesktop().browse(javadocFile.toURI());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


