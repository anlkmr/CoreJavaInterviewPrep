package com.java.CoreJavaInterviewPrep.multithreaded.unanomous;

import com.java.CoreJavaInterviewPrep.multithreaded.usingRunnable.Mycounter;

import java.util.Random;

import static java.lang.Thread.sleep;

public class Test1 {

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Random random = new Random();
                        sleep(random.nextInt(1000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(i);
                }
            }
        }).start();
    }
}
