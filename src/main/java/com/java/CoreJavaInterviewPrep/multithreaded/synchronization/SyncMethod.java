package com.java.CoreJavaInterviewPrep.multithreaded.synchronization;

import static java.lang.Thread.sleep;

class Brackets{

   synchronized public void generate(){
        for (int i = 0; i < 30; i++) {
            if (i<15){
                System.out.print("[");
            }else {
                System.out.print("]");
            }
        }
        System.out.println(" ");
    }
}
public class SyncMethod {



    public static int counter =0;
    public static void main(String[] args) throws InterruptedException {

        Brackets1 brackets = new Brackets1();

      Thread t1 =  new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    brackets.generate();
                }
            }
        });

       Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    brackets.generate();
                }
            }
        });

       t1.start();
       t2.start();
       //Thread.sleep(10000);

        System.out.println("counter : "+ SyncMethod.counter);
    }



    }


