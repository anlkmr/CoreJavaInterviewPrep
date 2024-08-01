package com.java.CoreJavaInterviewPrep.string_program;

public class RegularExpressionMatching {
    public static void main(String[] args) {
        String input = "ab";
        String pattern = ".*";
        boolean isMatch = input.matches(pattern);
        System.out.println("Is Match: " + isMatch);
    }
}
