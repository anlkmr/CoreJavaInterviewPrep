package com.java.CoreJavaInterviewPrep.multithreaded.usingRunnable;

public class Test1 {

    public static void main(String[] args) throws InterruptedException {
        Thread counter1 = new Thread(new Mycounter(1));
        Thread counter2 = new Thread(new Mycounter(2));

        long starttime = System.currentTimeMillis();
        counter1.start();
        counter2.start();
        Thread.sleep(6000);
        long stoptime = System.currentTimeMillis();

        System.out.println("Total time : "+(stoptime-starttime));
    }
}
