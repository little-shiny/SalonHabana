package JavaDocLauncher;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 * Clase para abrir automáticamente el JavaDoc del proyecto,
 * buscando la carpeta target/site/apidocs desde cualquier ubicación.
 *
 * Esta versión es robusta y muestra mensajes claros si no se encuentra el Javadoc.
 *
 * Autor: Cristina
 */
public class JavaDocLauncher {

    public static void main(String[] args) {
        File javadocFile = findJavadocFromCurrentDir();

        if (javadocFile == null) {
            System.err.println("No se encontró el archivo JavaDoc (target/site/apidocs/index.html).");
            System.err.println("Asegúrate de ejecutar este programa desde dentro del proyecto y de haber generado el JavaDoc con Maven (mvn javadoc:javadoc).");
            return;
        }

        try {
            System.out.println("Abriendo Javadoc: " + javadocFile.getAbsolutePath());
            Desktop.getDesktop().browse(javadocFile.toURI());
        } catch (IOException e) {
            System.err.println("Error al intentar abrir el JavaDoc:");
            e.printStackTrace();
        }
    }

    /**
     * Busca el index.html del JavaDoc desde el directorio actual,
     * subiendo recursivamente hasta la raíz del filesystem.
     */
    private static File findJavadocFromCurrentDir() {
        File dir = new File(System.getProperty("user.dir"));
        return searchJavadocUpwards(dir);
    }

    /**
     * Metodo recursivo que busca la carpeta target/site/apidocs y el index.html
     * subiendo hacia los directorios padres hasta el root.
     */
    private static File searchJavadocUpwards(File dir) {
        if (dir == null) {
            return null;
        }

        File javadocFile = new File(dir, "target/site/apidocs/index.html");
        if (javadocFile.exists()) {
            return javadocFile;
        }

        return searchJavadocUpwards(dir.getParentFile());
    }
}
