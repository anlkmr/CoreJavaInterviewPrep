package com.java.CoreJavaInterviewPrep.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicatesInts {
    public static void main(String[] args) {
        Integer[] numbers = {2, 4, 7, 2, 8, 10, 7, 15, 18, 7, 9, 7, 25, 36, 46, 50, 21, 2, 15};

        Map<Integer, Long> frequencyMap = Arrays.stream(numbers)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println("Number: " + entry.getKey() + ", Repeated Count: " + entry.getValue()));

        Arrays.asList(numbers).stream().sorted().forEach(System.out::println);

        Integer[] numbers3 = {2, 4, 7, 2, 8, 10, 7, 15, 18, 7, 9, 7, 25, 36, 46, 50, 21, 2, 15};

        Set<Integer> uniqueElements = new HashSet<>();
//Collect repeated numbers
        var collected1 = Arrays.asList(numbers3).stream().filter(x -> !uniqueElements.add(x)).collect(Collectors.toList());
        System.out.println(collected1);

//unique numbers
        Set<Integer> uniqueElement2 = new HashSet<>();
        Integer[] numbers4 = {2, 4, 7, 2, 8, 10, 7, 15, 18, 7, 9, 7, 25, 36, 46, 50, 21, 2, 15};

        var list2 = Arrays.asList(numbers4).stream().filter(x -> uniqueElement2.add(x))
                .peek(System.out::print)
                .toList();
        System.out.println(list2);

//collect only duplicate numbers
        HashMap<Integer,Integer> uniqueElement5 = new HashMap<Integer,Integer>();
        Integer[] numbers5 = {2, 4, 7, 2, 8, 10, 7, 15, 18, 7, 9, 7, 25, 36, 46, 50, 21, 2, 15};

        var list5 = Arrays.asList(numbers5).stream().distinct().collect(Collectors.toList());
        System.out.println(list5);


    }
}