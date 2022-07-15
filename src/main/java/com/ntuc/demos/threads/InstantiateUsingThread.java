package com.ntuc.demos.threads;

/**
 *
 * @author Sridhar Guzzu
 */
public class InstantiateUsingThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println("Thread Main has started");
        Thread t1 = new MyTask("Task 1");
        Thread t2 = new MyTask("Task 2");
        t1.start();
        t2.start();
        System.out.println("Thread Main finished running");
        
                
    }
}
