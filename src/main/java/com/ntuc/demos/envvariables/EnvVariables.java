package com.ntuc.demos.envvariables;

import java.util.Map;

/**
 *
 * @author Sridhar Guzzu
 */
public class EnvVariables {

    public static void main(String[] args) {
        // display all the environment variables
        Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n",
                    envName,
                    env.get(envName));
        }
    }
}
