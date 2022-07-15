package com.ntuc.demos.arrays;
import com.ntuc.demos.objects.Inheretence.*;
/**
 *
 * @author Sridhar Guzzu
 */
public class ArrayClone {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Employee[] empArr = new Employee[2];    //Original array
        
    
        empArr[0] = new Employee(100, "James", "Smith", new Department(1, "HR"));
        empArr[1] = new Employee(200, "Maria", "Gomez", new Department(2, "Finance"));

        Employee[] clonedArray = empArr.clone();  //Shallow copied array

        empArr[0].setFirstName("David");
        empArr[0].getDepartment().setName("Admin");

        //Verify the change in original array - "CHANGED"
        System.out.println(empArr[0].getFirstName());                     //David
        System.out.println(empArr[0].getDepartment().getName());          //Admin

        //Verify the change in cloned array - "CHANGED"
        System.out.println(clonedArray[0].getFirstName());                  //David
        System.out.println(clonedArray[0].getDepartment().getName());       //Admin
    }
}
























