package com.java;

public class Demo{

    public static void main(String[] args){

        Singleton1 s1 = Singleton1.getInstance();
        s1.printmsg();

        Demo1 demo1 = new Demo1("name1");
        Demo1 demo11 = new Demo1();
    }



}
