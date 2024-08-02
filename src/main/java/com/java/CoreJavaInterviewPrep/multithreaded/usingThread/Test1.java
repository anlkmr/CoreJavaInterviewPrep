package com.java.CoreJavaInterviewPrep.multithreaded.usingThread;

public class Test1 {

    public static void main(String[] args) throws InterruptedException {
        Mycounter counter1 = new Mycounter(1);
        Mycounter counter2 = new Mycounter(2);

        long starttime = System.currentTimeMillis();
        counter1.start();
        counter2.start();
        Thread.sleep(6000);
        long stoptime = System.currentTimeMillis();

        System.out.println("Total time : "+(stoptime-starttime));
    }
}
