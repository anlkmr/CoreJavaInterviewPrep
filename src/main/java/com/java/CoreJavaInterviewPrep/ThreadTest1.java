package com.java.CoreJavaInterviewPrep;

public class ThreadTest1 {

    public static void main(String[] args) {

        Thread t = new Thread(() -> System.out.println("Run now "));

        t.start();

    }
}
