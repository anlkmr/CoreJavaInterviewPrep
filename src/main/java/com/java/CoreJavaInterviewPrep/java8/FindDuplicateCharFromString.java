package com.java.CoreJavaInterviewPrep.java8;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateCharFromString {

    public static void main(String[] args) {

        String input = "gainjavaknowledge";

        Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(ele -> ele.getValue() > 1)
                        .forEach(ele -> System.out.println(ele.getKey() +":"+ele.getValue()));
               // .map(Map.Entry :: getKey)
                //.collect(Collectors.toList());


    }
}