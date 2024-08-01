package com.java.CoreJavaInterviewPrep.string_program;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WordReversal {
    public static void main(String[] args) {
        String sentence = "Hello, World!";
        String reversedSentence = Arrays.stream(sentence.split("\\s+"))
                .map(word -> new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
        System.out.println("Reversed Sentence: " + reversedSentence);
    }
}
