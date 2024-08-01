package com.java.CoreJavaInterviewPrep.string_program;

public class VowelConsonantCount {
    public static void main(String[] args) {
        String input = "Hello, World!";
        long vowelCount = input.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
        long consonantCount = input.toLowerCase().chars().filter(c -> "bcdfghjklmnpqrstvwxyz".indexOf(c) != -1).count();
        System.out.println("Vowel Count: " + vowelCount);
        System.out.println("Consonant Count: " + consonantCount);
    }
}
