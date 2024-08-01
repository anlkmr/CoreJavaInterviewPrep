package com.java.CoreJavaInterviewPrep.string_program;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "flight"};
        String commonPrefix = Arrays.stream(strings)
                .reduce((s1, s2) -> {
                    int i = 0;
                    while (i < s1.length() && i < s2.length() && s1.charAt(i) == s2.charAt(i)) {
                        i++;
                    }
                    return s1.substring(0, i);
                }).orElse("");
        System.out.println("Longest Common Prefix: " + commonPrefix);
    }
}
