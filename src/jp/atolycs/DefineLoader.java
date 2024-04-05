package jp.atolycs;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Locale;
import java.util.ResourceBundle;
import java.io.File;
import java.nio.file.Paths;

import jp.atolycs.LogUtil;

public class DefineLoader { 
    
    public static ResourceBundle gen_load(String define) throws MalformedURLException {
        
        LogUtil log = new LogUtil();

        // Get Resource Folder path
        File dicDir = Paths.get(".\\res").toFile();

        // Encode URL
        URLClassLoader urlLoader = new URLClassLoader(
            new URL[]{
                dicDir.toURI().toURL()
            }
        );

        ResourceBundle rb = 
            ResourceBundle.getBundle(define, Locale.getDefault(), urlLoader);
        
        log.info("Loaded Define File: " + define);
        return rb;
    }

    
    public static ResourceBundle user_load(String define) throws MalformedURLException {
        
        LogUtil log = new LogUtil();

        // Get Resource Folder path
        File dicDir = Paths.get(".\\res\\endusers").toFile();

        // Encode URL
        URLClassLoader urlLoader = new URLClassLoader(
            new URL[]{
                dicDir.toURI().toURL()
            }
        );

        ResourceBundle rb = 
            ResourceBundle.getBundle(define, Locale.getDefault(), urlLoader);
        
        log.info("Loaded End user Define File: " + define);
        return rb;
    }

}
