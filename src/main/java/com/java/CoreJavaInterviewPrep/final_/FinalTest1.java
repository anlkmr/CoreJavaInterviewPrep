package com.java.CoreJavaInterviewPrep.final_;


class A{
    private final int num;

    public A(int num) {
        this.num = num;
    }

    final int method1(){
        return 1;
    }

    int method2(){
        return 2;
    }
}

class AA extends A {
    private  final int numAA;

    AA(int numAA, int numA) {
        super(numA);
        this.numAA = numAA;

    }

    @Override
    int method2(){
        return 22;
    }
}


public class FinalTest1 {

    public static void main(String[] args) {

        A a = new A(1);
        int i = a.method1();
        System.out.println("A call : i = "+i );

        AA aa = new AA(11,1);
        int i1 = aa.method1();
        int i2 = aa.method2();
        System.out.println("AA call : i1, i2 = "+i1 +","+i2);

    }
}
