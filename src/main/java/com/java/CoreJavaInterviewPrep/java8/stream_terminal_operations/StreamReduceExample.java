package com.java.CoreJavaInterviewPrep.java8.stream_terminal_operations;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamReduceExample {

    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1,2,3,4,5);

        Optional<Integer> intOptional = numbers.reduce((i, j) -> {return i*j;});
        if(intOptional.isPresent()) System.out.println("Multiplication = "+intOptional.get()); //120
    }
}
