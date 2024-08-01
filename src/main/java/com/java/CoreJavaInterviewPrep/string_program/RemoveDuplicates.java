package com.java.CoreJavaInterviewPrep.string_program;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";
        String result = new LinkedHashSet<>(Arrays.asList(input.split(""))).stream()
                .collect(Collectors.joining());
        System.out.println("After removing duplicates: " + result);
    }
}

