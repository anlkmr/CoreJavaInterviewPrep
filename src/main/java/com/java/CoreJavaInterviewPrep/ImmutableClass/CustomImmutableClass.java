package com.java.CoreJavaInterviewPrep.ImmutableClass;

import java.util.Objects;

final class Test1{
    final int num;
    int num2;

    public Test1(int num){
        super();
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test1 test1 = (Test1) o;
        return num == test1.num && num2 == test1.num2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, num2);
    }
}


public class CustomImmutableClass {


    public static void main(String[] args) {

        Test1 a = new Test1(1);
        Test1 b = new Test1(1);

        System.out.println(a.equals(b));
        System.out.println(a == b);

        a.setNum2(1);
        System.out.println("After modifying the instance a : ");
        System.out.println(a.equals(b));
        System.out.println(a == b);
    }


}
