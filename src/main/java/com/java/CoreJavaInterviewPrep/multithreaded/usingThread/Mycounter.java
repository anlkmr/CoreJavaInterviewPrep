package com.java.CoreJavaInterviewPrep.multithreaded.usingThread;

public class Mycounter extends Thread{

    private final int threadNo;

    public Mycounter(int threadNo){
        this.threadNo = threadNo;
    }

    @Override
    public void run(){
        try {
            counterOnMe();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void counterOnMe() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            sleep(500);
            System.out.println("ThreadNo : "+threadNo +" count: "+i);
        }
    }
}
