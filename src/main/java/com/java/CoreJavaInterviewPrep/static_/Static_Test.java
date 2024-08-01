package com.java.CoreJavaInterviewPrep.static_;

public class Static_Test {


    public static void main(String args[]){

        Outer.InnerStatic.staticMessage();

        Outer outer = new Outer();
        Outer.InnerNonStatic innerNonStatic = outer.getInnerNonStatic();
        innerNonStatic.nonstaticMessage();

        Outer.InnerNonStatic_InnerStaticVariables innerNonStaticInnerStaticVariables = outer.getInnerNonStaticInnerStaticVariables();
        System.out.println("innerNonStaticInnerStaticVariables.variable2: "+innerNonStaticInnerStaticVariables.variable2);
    }



}
