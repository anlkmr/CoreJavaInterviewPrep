package com.java.CoreJavaInterviewPrep.singleton_;


 class Singleton1 {

    private static Singleton1 singleton1;

    private Singleton1(){}

    public static synchronized Singleton1 getSingleton1(){

        if(singleton1 == null){
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}


public class Test1 {

    public static void main(String[] args) {

        Singleton1 a = Singleton1.getSingleton1();
        Singleton1 b = Singleton1.getSingleton1();

        System.out.println(a==b);

    }
}
