package com.ntuc.demos.threads;

/**
 *
 * @author Sridhar Guzzu
 */
public class MyTask extends Thread {

    private String anyData;

    public MyTask(String anyData) {
        this.anyData = anyData;
    }
    
    public void run(){
        System.out.println("Thread name is: "+ Thread.currentThread().getName());
    }
}
