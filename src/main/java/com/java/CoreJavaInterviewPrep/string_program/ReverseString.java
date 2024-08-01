package com.java.CoreJavaInterviewPrep.string_program;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello, World!";
        String reversed = reverseString(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }

    private static String reverseString(String str) {
        StringBuilder t = new StringBuilder(str);

        return new StringBuilder(str).reverse().toString();
    }
}
