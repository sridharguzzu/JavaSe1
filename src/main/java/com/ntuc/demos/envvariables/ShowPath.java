package com.ntuc.demos.envvariables;

import java.util.Map;

/**
 *
 * @author Sridhar Guzzu
 */
public class ShowPath {

    public static void main(String[] args) {
        // Display the path
        System.out.println("The following folders are in the PATH");
        System.out.println("--------------------------------------");
        String path = System.getProperty("java.library.path");
        String separator = System.getProperty("path.separator");
        String finalPath = "";

        char[] charPath = path.toCharArray();
        char[] sep = separator.toCharArray();
        String pathd = "";
        for (int i = 0; i < charPath.length; i++) {
            pathd += charPath[i];
            if (charPath[i] == sep[0]) {
                pathd += "\n";
            }
        }
        System.out.println(pathd);

        // Display the classpath
        System.out.println("The following folders are in the CLASSPATH");
        System.out.println("--------------------------------------");
        String classPath = System.getProperty("java.class.path");
        charPath = classPath.toCharArray();
        pathd = "";
        for (int i = 0; i < charPath.length; i++) {
            pathd += charPath[i];
            if (charPath[i] == sep[0]) {
                pathd += "\n";
            }
        }
        System.out.println(pathd);

    }
}
