package com.java.CoreJavaInterviewPrep;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test55 {

    public static void main(String[] args) {

List<String> nameList = Arrays.asList("Ankur","Bagat","Rohin","Andry");

nameList.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList()).forEach(System.out::println);

    }

    }
