/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.syscenterlife.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

/**
 *
 * @author Datos
 */
public class UtilsX {

    public URL getFile(String ruta) {
        return this.getClass().getResource("/" + ruta);
    }

    public File getFileExterno(String carpeta, String filex) {
        File newFolder = new File(carpeta);
        String ruta = newFolder.getAbsolutePath();
        Path CAMINO = Paths.get(ruta + "/" + filex);
        return CAMINO.toFile();
    }

    public File getFolderExterno(String carpeta) {
        File newFolder = new File(carpeta);
        String ruta = newFolder.getAbsolutePath();
        Path CAMINO = Paths.get(ruta + "/");
        return CAMINO.toFile();
    }

    public Properties detectLanguage(String idioma) {
        Properties myresourcesx = new Properties();
        try {
            FileInputStream in = new FileInputStream(
                    getFileExterno("language", "idiomas-" + idioma + ".properties").getAbsolutePath());
            try {
                myresourcesx.load(in);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return myresourcesx;
    }

    public String readLanguageFile() {
        Properties myresourcesx = new Properties();
        String idioma = "";
        try {
            FileInputStream in = new FileInputStream(
                    getFileExterno("language", "SysCenterLife.properties").getAbsolutePath());
            try {
                myresourcesx.load(in);
                idioma = myresourcesx.getProperty("syscenterlife.idioma");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return idioma;
    }

}
