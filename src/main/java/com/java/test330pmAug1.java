package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class test330pmAug1 {



    public static void main(String[] args) {
        System.out.println("Hello, World!");

        List<List<Integer>> listOfList = new ArrayList();

        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();

        firstList.add(1);
        firstList.add(3);


        secondList.add(1);
        secondList.add(3);

        listOfList.add(firstList);
        listOfList.add(secondList);

        List<Integer> collected = listOfList.stream().flatMap(List::stream).collect(Collectors.toList());
        collected.stream().distinct().forEach(System.out::println);
    }



}
