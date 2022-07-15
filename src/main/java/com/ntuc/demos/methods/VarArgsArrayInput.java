package com.ntuc.demos.methods;
import com.ntuc.demos.arrays.ArrayInputReturn;
/**
 *
 * @author Sridhar Guzzu
 */
public class VarArgsArrayInput {

    /**
     * @param args the command line arguments
     */
    
    //driver class
    public static void main(String args[]) {
       ArrayInputReturn air = new ArrayInputReturn();
       String[] namesInTitle = VarArgsTitleCase.namesTitle(air.getArray());
        for (int i = 0; i < namesInTitle.length; i++) {
            System.out.println(namesInTitle[i]);
        }
    }
}
