package com.java.CoreJavaInterviewPrep.exception;

public class ExceptionMain {


    public static void main(String[] args) {

        try {
            callExceptionMethod();
        } catch (CustomMathDbyzeroException e) {
            System.out.println("caught in main and processed\n");
            e.printStackTrace();
        }

    }

    private static void callExceptionMethod() throws CustomMathDbyzeroException {

        System.out.println("starting");

        int result;

        try {
            result = 100/0;
        } catch (ArithmeticException e) {
            throw new CustomMathDbyzeroException(e);
        } finally {
            System.out.println("in finally");
        }

        System.out.println("after the exception");

    }

}
