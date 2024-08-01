package com.java.CoreJavaInterviewPrep;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test7 {
//https://medium.com/@abhishek.talakeriv/java8-stream-api-commonly-asked-interview-questions-part-2-863e5c808842
    public static void main(String[] args) {

//
        String[] words= {"apple", "banana", "apple", "orange", "banana", "apple"};
        Map<String, Long> collect = Arrays.asList(words).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        List<String> list = Arrays.asList("apple", "banana", "orange", "kiwi", "strawberry");
        var max = list.stream().max(Comparator.comparingInt(String::length));
        System.out.println(max.get());

        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 1);
        //var sorted = numbers.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        var sorted = numbers.stream().distinct().sorted(Comparator.comparingInt(Integer::intValue).reversed()).collect(Collectors.toList());
        System.out.println(sorted);

        List<Double> doubles = Arrays.asList(1.2, 3.5, 2.8, 4.1, 5.7);
        var average = doubles.stream().mapToDouble(Double::doubleValue).average();
        System.out.println(average);

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 4, 5);
        var collected = Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
        System.out.println(collected);

        List<String> listW = Arrays.asList("Hello", " ", "world", "!");
        var collected1 = listW.stream().collect(Collectors.joining());
        System.out.println(collected1);

        String str = "abacdbef";
        var first = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1L)
                .map(Map.Entry::getKey)
                .findFirst();
        System.out.println(first.get());

        List<String> listR = Arrays.asList("apple", "banana", "orange", "kiwi");
        char specificChar = 'a';
        var collectRem = listR.stream().filter(x -> !x.contains(String.valueOf(specificChar))).collect(Collectors.toList());
        System.out.println(collectRem);

        List<Integer> numbersOE = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Set<Map.Entry<Boolean, List<Integer>>> collectPart = numbersOE.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0)).entrySet();
               for (Map.Entry<Boolean, List<Integer>> booleanListEntry : collectPart) {
                   if (booleanListEntry.getKey()){
                       System.out.println("Even numbers "+booleanListEntry.getValue());
                   }
               }

        List<Integer> listLar = Arrays.asList(1, 12, 44, 32, 52, 81, 59, 84, 72, 37);
        int k = 4;
        var i = listLar.stream().sorted(Comparator.reverseOrder()).limit(k).skip(k - 1).findFirst().orElse(-1);
        System.out.println(i);

        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
        var collected2 = integerList.stream().map(x -> x * x * x).filter(x -> x > 50).collect(Collectors.toList());
        System.out.println(collected2);

        List<String> listOv = Arrays.asList("apple", "banana", "orange", "kiwi", "strawberry");
        var count = listOv.stream().filter(x -> "aeiou".contains(String.valueOf(x.charAt(0)))).count();
        System.out.println(count);

        List<String> listW3 = List.of("level", "hello", "radar", "world", "madam", "java", "Malayalam");
        var max1 = listW3.stream().filter(x -> new StringBuilder(x).reverse().toString().equalsIgnoreCase(x)).max(Comparator.comparingInt(String::length));
        System.out.println(max1.get());

        List<Integer> integerListProdNonNeg = Arrays.asList(4, 5, -6, 7, -1, 2, -3);
        var reducedProduct = integerListProdNonNeg.stream().filter(x -> x > 0).mapToLong(Integer::longValue).reduce(1, (a, b) -> a * b);
        System.out.println(reducedProduct);



    }

}

