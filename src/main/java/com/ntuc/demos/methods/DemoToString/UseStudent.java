package com.ntuc.demos.methods.DemoToString;

/**
 *
 * @author Sridhar Guzzu
 */
public class UseStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Student s1 = new Student(10, "David");
        Student s2 = new Student(11, "Alex");
        Student s3 = new Student(111, "Alex");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
