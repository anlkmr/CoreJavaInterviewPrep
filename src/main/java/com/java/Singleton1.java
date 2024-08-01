package com.java;

public class Singleton1 {

    private Singleton1(){}

    public static Singleton1 getInstance(){



        return SingletonHelper.unique;
    }

    public void printmsg(){
        System.out.println("in");
    }


    private static class SingletonHelper{

        private static final Singleton1 unique = new Singleton1();

    }

// Select distinct salary from employee order by salary desc limit 1 offset 1;
}


