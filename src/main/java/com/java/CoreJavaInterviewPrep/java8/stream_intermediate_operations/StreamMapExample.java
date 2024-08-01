package com.java.CoreJavaInterviewPrep.java8.stream_intermediate_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {
//TODO map(Function<? super T,? extends R> mapper)
//Returns a stream consisting of the results of applying the given function to the elements of this stream.
    public static void main(String[] args){
    //operation of number * 3 on each element of stream
        System.out.println("The stream after applying "
                + "the function is : ");

        // Creating a list of Integers
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);

        // Using Stream map(Function mapper) and
        // displaying the corresponding new stream
        list.stream().map(number -> number * 3).forEach(System.out::println);

    // displaying the new stream of UpperCase Strings
        System.out.println("The stream after applying "
                + "the function is : ");

        // Creating a list of Integers
        List<String> list1 = Arrays.asList("geeks", "gfg", "g",
                "e", "e", "k", "s");

        // Using Stream map(Function mapper) to
        // convert the Strings in stream to
        // UpperCase form
        List<String> answer = list1.stream().map(String::toUpperCase).
                collect(Collectors.toList());

        // displaying the new stream of UpperCase Strings
        System.out.println(answer);

    //mapping string length in place of string
        System.out.println("The stream after applying "
                + "the function is : ");

        // Creating a list of Strings
        List<String> list2 = Arrays.asList("Geeks", "FOR", "GEEKSQUIZ",
                "Computer", "Science", "gfg");

        // Using Stream map(Function mapper) and
        // displaying the length of each String
        list2.stream().map(str -> str.length()).forEach(System.out::println);

    //

    }

}
