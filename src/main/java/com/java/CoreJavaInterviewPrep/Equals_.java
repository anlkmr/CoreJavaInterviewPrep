package com.java.CoreJavaInterviewPrep;


import java.util.Objects;

class A{
    int num;
    int var;

    public A(int num, int var) {
        this.num = num;
        this.var = var;
    }

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public int getVar() {
        return var;
    }
    public void setVar(int var) {
        this.var = var;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return num == a.num && var == a.var;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, var);
    }
}



public class Equals_ {


    public static void main(String[] args) {

        A a1 = new A(1,1);
        A a2 = new A(1,1);

        System.out.println(a1.equals(a2));
        System.out.println(a1==a2);

        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
    }

}
