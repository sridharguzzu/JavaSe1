package com.ntuc.demos.objects;

/**
 *
 * @author Sridhar Guzzu
 */
public class ObjectBasic {

    double englishMarks, mathsMarks, scienceMarks;

    public double studentOne() {
        englishMarks = 65.55;
        mathsMarks = 75;
        scienceMarks = 70;
        return englishMarks + mathsMarks + scienceMarks;
    }

    public double studentTwo() {
        englishMarks = 60;
        mathsMarks = 79;
        scienceMarks = 80;
        return englishMarks + mathsMarks + scienceMarks;
    }

    public static void main(String args[]) {
        ObjectBasic ob = new ObjectBasic();
        System.out.println("Student One Scored: " + ob.studentOne());
        System.out.println("Student Two Scored: " + ob.studentTwo());
    }

}
