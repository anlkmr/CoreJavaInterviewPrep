package com.java.CoreJavaInterviewPrep.multithreaded.usingRunnable;

import java.util.Random;

import static java.lang.Thread.sleep;

public class Mycounter implements Runnable{

    private final int threadNo;

    public Mycounter(int threadNo){
        this.threadNo = threadNo;
    }

    @Override
    public void run(){

            for (int i = 0; i < 10; i++) {
                try {
                    Random random = new Random();
                sleep(random.nextInt(1000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("ThreadNo : "+threadNo +" count: "+i);
            }

    }


}
