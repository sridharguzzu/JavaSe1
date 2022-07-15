package com.ntuc.demos.threads;

/**
 *
 * @author Sridhar Guzzu
 */
public class ThreadSample extends Thread {

    public static int amount = 0;

    public static void main(String args[]) {
        ThreadSample thread = new ThreadSample();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    public void run() {
        amount+=100;
    }
}
