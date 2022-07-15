package com.ntuc.demos.objects;

import java.util.*;

/**
 *
 * @author Sridhar Guzzu
 */
public class AddStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.YEAR, 2005);
        cal.set(Calendar.MONTH, 5);
        cal.set(Calendar.DATE, 20);

        Student student = new Student();
        student.firstName = "John";
        student.lastName = "Doe";
        student.grade = 4;
        student.dob = cal;

        System.out.println(student.firstName + " " + student.lastName + " is "+ student.getAge(new GregorianCalendar()) + " Years old");

    }
}
