package com.java.CoreJavaInterviewPrep;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class w3resourcceTest {

    public static void main(String[] args){

AtomicInteger sum = new AtomicInteger();

        var avg = Arrays.asList(1, 2, 3, 4, 5, 6).stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);

        System.out.println(avg);

        List<String> words2 = Arrays.asList("apple", "HOME", "chErry", "daTe", "grape");
        words2.stream().map(String::toUpperCase).toList().forEach(System.out::println);

        var sum1 = Arrays.asList(1, 2, 3, 4, 5, 6).stream().filter(x -> !(x % 2 == 0)).mapToDouble(Integer::doubleValue).sum();
        System.out.println(sum1);
        Arrays.asList("x", "x","e","e").stream().distinct().forEach(System.out::println);

        List<String> words3 = Arrays.asList("apple", "HOME", "achErry", "daTe", "grape");
        System.out.println(words3.stream().filter(x->x.startsWith("a")).count());

            List<String> words4 = Arrays.asList("apple", "HOME", "achErry", "daTe", "grape");
            words4.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);



    }
}
