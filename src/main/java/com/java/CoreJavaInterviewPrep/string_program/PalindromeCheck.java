package com.java.CoreJavaInterviewPrep.string_program;

public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "madam";
        boolean isPalindrome = checkPalindrome(input);
        System.out.println("Is '" + input + "' a palindrome? " + isPalindrome);
    }

    private static boolean checkPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
