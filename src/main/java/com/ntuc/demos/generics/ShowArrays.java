package com.ntuc.demos.generics;

/**
 *
 * @author Sridhar Guzzu
 */
public class ShowArrays {

    /**
     * @param args the command line arguments
     */
//    public  static void showar(String[] s){
//        for (int i = 0; i < s.length; i++) {
//            System.out.println(s[i]);
//        }
//    }
//    
//    public  static void showar(Integer[] s){
//        for (int i = 0; i < s.length; i++) {
//            System.out.println(s[i]);
//        }
//    }
    public static <E> void printar(E[] arr) {
        for (E t : arr) {
            System.out.println(t);
        }
    }
    
    public static void main(String args[]) {
        String[] sar = {"One", "Two", "Three", "Anything"};
        Integer[] iar = {1, 2, 3, 4, 5};
        Double[] dar = {1.5d, 2.3d, 4.2d};



        printar(iar);
        printar(sar);
        printar(dar);

    }
}
