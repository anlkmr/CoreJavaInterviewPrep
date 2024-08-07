package com.java.CoreJavaInterviewPrep.java8.stream_intermediate_operations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


public class GettingaMapsKeysUsingStreams {

    public static void main(String[] args){

       //TODO  Let’s assume we have a Map:

        Map<String, String> books = new HashMap<>();
        books.put(
                "978-0201633610", "Design patterns : elements of reusable object-oriented software");
        books.put(
                "978-1617291999", "Java 8 in Action: Lambdas, Streams, and functional-style programming");
        books.put("978-0134685991", "Effective Java");

    //Retrieving a Match
        Optional<String> optionalIsbn = books.entrySet().stream()
                .filter(e -> "Effective Java".equals(e.getValue()))
                .map(Map.Entry::getKey)
                .findFirst();
        System.out.println(optionalIsbn.get());
        //assertEquals("978-0134685991", optionalIsbn.get());

    //Retrieving Multiple Results
        books.put("978-0321356680", "Effective Java: Second Edition");
        List<String> isbnCodes = books.entrySet().stream()
                .filter(e -> e.getValue().startsWith("Effective Java"))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        isbnCodes.forEach(System.out::println);

        books.entrySet().stream().filter(x -> x.getValue().startsWith("Effective Java")).map(Map.Entry::getKey).collect(Collectors.toList()).forEach(System.out::println);

    }
}
