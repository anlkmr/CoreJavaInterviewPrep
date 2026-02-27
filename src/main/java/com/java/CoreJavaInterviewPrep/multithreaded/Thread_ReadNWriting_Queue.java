package com.java.CoreJavaInterviewPrep.multithreaded;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Thread_ReadNWriting_Queue {

    public static void main(String[] args) {

    ConcurrentLinkedQueue<String> inputQueue = new ConcurrentLinkedQueue<String>();
    ConcurrentLinkedQueue<String> outputQueue = new ConcurrentLinkedQueue<String>();

    Thread writerThread = new Thread( () -> {

        String message = "first String";
        System.out.println(" first String created");

        inputQueue.offer(message);

    });

    Thread reverserThread = new Thread(()->{

        String collectedMessage = inputQueue.poll();

        if(collectedMessage != null){

            System.out.println(" message is being reversed here");
            String reversedString = new StringBuilder(collectedMessage).reverse().toString();

            System.out.println("Inserting into Another queue ");

            outputQueue.offer(reversedString);


        }

    });

    Thread toreadThread = new Thread(() -> {

        String reverseCollectedMessage = outputQueue.poll();

        if(reverseCollectedMessage != null){
            System.out.println("The collected reversed message is : " +reverseCollectedMessage);
        }

    });

    writerThread.start();
    reverserThread.start();
    toreadThread.start();

    //trying the joins
        try {
        writerThread.join();
        reverserThread.join();

            toreadThread.join();
        } catch (InterruptedException e) {
            //
Thread.currentThread().interrupt();
            System.out.println(" Main interrupted");
        }

    }

}
