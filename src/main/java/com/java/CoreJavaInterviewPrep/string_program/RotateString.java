package com.java.CoreJavaInterviewPrep.string_program;

public class RotateString {
    public static void main(String[] args) {
        String input = "abcdef";
        int k = 3;
        String rotated = input.substring(input.length() - k) + input.substring(0, input.length() - k);
        System.out.println("Rotated String: " + rotated);
    }
}
