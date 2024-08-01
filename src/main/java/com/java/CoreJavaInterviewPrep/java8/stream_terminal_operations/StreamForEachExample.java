package com.java.CoreJavaInterviewPrep.java8.stream_terminal_operations;

import java.util.stream.Stream;

public class StreamForEachExample {
    public static void main(String[] args) {
        Stream<Integer> numbers2 = Stream.of(1,2,3,4,5);
        numbers2.forEach(i -> System.out.print(i+",")); //1,2,3,4,5,
    }
}
