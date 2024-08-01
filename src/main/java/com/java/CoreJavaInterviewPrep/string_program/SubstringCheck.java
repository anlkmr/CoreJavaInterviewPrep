package com.java.CoreJavaInterviewPrep.string_program;
public class SubstringCheck {
    public static void main(String[] args) {
        String mainString = "Hello, World!";
        String substring = "World";
        boolean isSubstring = mainString.contains(substring);
        System.out.println("Is \"" + substring + "\" present: " + isSubstring);
    }
}
