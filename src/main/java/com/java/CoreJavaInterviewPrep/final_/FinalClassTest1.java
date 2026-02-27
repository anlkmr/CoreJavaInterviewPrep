package com.java.CoreJavaInterviewPrep.final_;


class A1 {
    private int num;


    public A1(int num) {
        this.num = num;
    }
}

final class A2 extends  A1{
    private int num;

    public A2(int num) {
        super(num);
        this.num = num;
    }
}


public class FinalClassTest1 {

    public static void main(String[] args) {

    }
}
