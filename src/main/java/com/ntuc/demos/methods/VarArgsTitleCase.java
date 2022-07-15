package com.ntuc.demos.methods;

/**
 *
 * @author Sridhar Guzzu
 */
public class VarArgsTitleCase {

    /**
     * @param args the command line arguments
     */
    
    static String[] namesTitle(String... names){
        String[] resArray = new String[names.length];
        for (int name = 0; name < names.length; name++) {
            resArray[name]= names[name].substring(0,1).toUpperCase()+names[name].substring(1).toLowerCase();
        }
        return resArray;
    }
    
}
