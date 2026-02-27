package com.java.CoreJavaInterviewPrep;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test10Aug {

    public static void main(String[] args) {

//
//        Move all zeroes to end of String using streams or in core java
         String s1 = "1,2,4,5,0,5,6,0,2,0";
         String s2 = "1,2,4,5,5,6,2,0,0,0";

        // Using streams

        List<String> stringList = Arrays.asList(s1.split(","));

        List<String> collected = stringList.stream().filter(e -> !e.equals("0"))
                .collect(Collectors.toList());

        long zeroCount = collected.stream().filter(e -> e.equals("0")).count();

        String finalResult = Stream.concat(collected.stream(), (IntStream.range(0, (int) zeroCount)).mapToObj(i -> "0")).collect(Collectors.joining(","));

        System.out.println(finalResult);

    }


}
