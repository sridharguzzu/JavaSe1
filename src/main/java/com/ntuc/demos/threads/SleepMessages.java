package com.ntuc.demos.threads;

/**
 *
 * @author Sridhar Guzzu
 */
public class SleepMessages {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
            throws InterruptedException {
        String importantInfo[] = {
            "Learining Java",
            "Threads",
            "Lists",
            "Maps"
        };

        for (int i = 0;
                i < importantInfo.length;
                i++) {
            //Pause for 4 seconds
            Thread.sleep(4000);
    
            System.out.println(importantInfo[i]
                    +" -- from the thread " + Thread.currentThread().getName());
        }
    }
}
