package com.ntuc.demos.objects.Inheretence;

/**
 *
 * @author Sridhar Guzzu
 */
public class Extend {

    public static void main(String args[]) {
        Book b = new Book("The Lord Of The Rings",
                "J.R.R. Tolkein",
                "George Allen and Unwin",
                "Fantasy");
        Book a = new Book("Mobile Computing",
                "Vinay Kumar",
                "Oreily",
                "Technology");
        Poem p = new Poem("The Iliad",
                "Homer",
                "Dactylic Hexameter");

        Literature[] lit = new Literature[4];
        lit[0] = b;
        lit[1] = p;
        lit[2] = a;
        lit[3] = p;

        for (int i = 0; i < lit.length; i++) {
            lit[i].Print();
        }

    }
}
