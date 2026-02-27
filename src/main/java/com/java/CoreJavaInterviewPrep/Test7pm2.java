package com.java.CoreJavaInterviewPrep;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test7pm2 {



    //

//    A thread writes a string to a collection.
//    Another thread reads that string and reverses it and
//            writes
//    back to a different collection from which the first thread reads
//    and prints. Can you implement this in Java?

    public static void main(String[] args) throws InterruptedException {


    BlockingQueue<String> inputQueue = new ArrayBlockingQueue<>(1);
    BlockingQueue<String> outputQueue = new ArrayBlockingQueue<>(1);


    Thread firstThread = new Thread(() -> {

        String firstString = "first String";
        System.out.println(firstString);
        try {
            inputQueue.put(firstString);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    });

    Thread reverseThread = new Thread(() -> {

        String polledMessage = inputQueue.poll();

        String reversedString = new StringBuilder(polledMessage).reverse().toString();

        try {
            outputQueue.put(reversedString);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    });

    Thread retriveThread = new Thread(() -> {

        String finalString = outputQueue.poll();
        System.out.println(finalString);

    });

    firstThread.start();
    reverseThread.start();
    retriveThread.start();

        firstThread.join();
        reverseThread.join();
        retriveThread.join();

    }


}
