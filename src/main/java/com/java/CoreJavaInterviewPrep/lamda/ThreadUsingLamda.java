package com.java.CoreJavaInterviewPrep.lamda;

interface  Lambda1{
    public void demo();

}

public class ThreadUsingLamda {


    public static void main(String[] args) {
        Thread th = new Thread( () -> {
            System.out.println("created using functional interface : ");
        } );
        th.start();
    }
}
