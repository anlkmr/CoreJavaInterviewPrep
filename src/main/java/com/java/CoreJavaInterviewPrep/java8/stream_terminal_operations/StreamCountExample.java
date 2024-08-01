package com.java.CoreJavaInterviewPrep.java8.stream_terminal_operations;

import java.util.stream.Stream;

public class StreamCountExample {
    public static void main(String[] args) {
        Stream<Integer> numbers1 = Stream.of(1,2,3,4,5);

        System.out.println("Number of elements in stream="+numbers1.count()); //5

    }
}
