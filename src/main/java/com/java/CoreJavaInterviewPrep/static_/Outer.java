package com.java.CoreJavaInterviewPrep.static_;

public class Outer {

    private String privateOuterVariable = "privateOuterVariable";
    public InnerNonStatic innerNonStatic = new InnerNonStatic();
    public InnerNonStatic_InnerStaticVariables innerNonStaticInnerStaticVariables = new InnerNonStatic_InnerStaticVariables("staticInnerNonStaticClassVariable");

    public static class InnerStatic{

        private static String privateInnerStaticVariable = "privateInnerStaticVariable";
        public static void staticMessage(){
            System.out.println("Hello static message.");
        }
    }

    public class InnerNonStatic{

        public void nonstaticMessage(){
            System.out.println("Hello non static message.");
            System.out.println("privateOuterVariable: "+privateOuterVariable);
            System.out.println("privateInnerStaticVariable: "+ InnerStatic.privateInnerStaticVariable);
        }
    }

    public class InnerNonStatic_InnerStaticVariables{

        public static String variable1;
        public  String variable2 = "InnerNonStatic_InnerStaticVariable";

        public InnerNonStatic_InnerStaticVariables(String s) {
            variable1 = s;
            System.out.println("InnerNonStatic_InnerStaticVariable variable1: value assigned.");
        }
    }

    public InnerNonStatic getInnerNonStatic() {
        return innerNonStatic;
    }

    public InnerNonStatic_InnerStaticVariables getInnerNonStaticInnerStaticVariables() {
        return innerNonStaticInnerStaticVariables;
    }
}
