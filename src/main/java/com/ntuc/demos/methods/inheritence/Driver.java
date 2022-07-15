package com.ntuc.demos.methods.inheritence;

/**
 *
 * @author Sridhar Guzzu
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       Parent obj1 = new Parent();
        obj1.show();
        obj1.eat();
        obj1.write();
        obj1.move();
       Child obj2 = new Child();
        obj2.show();
        obj2.eat();
        obj2.write();
        obj2.move();
        obj2.study();
        obj2.surivive();
        
    }
}


// final
/* variable -- cannot be reassigned with new value
   method -- cannot be overridden
   class -- cannot be extended
*/