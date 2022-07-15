package com.ntuc.demos.methods.inheritence;

/**
 *
 * @author Sridhar Guzzu
 */
class Parent {

    void show() {
        System.out.println("Parent's Activities");
        System.out.println("___________________");
    }

    void eat() {
        System.out.println("Eats with right hand");
    }

    void write() {
        System.out.println("writes with right hand");
    }

    void move() {
        System.out.println("Can run");
    }
    
    final void surivive(){
        System.out.println("Breathe");
    }

}
