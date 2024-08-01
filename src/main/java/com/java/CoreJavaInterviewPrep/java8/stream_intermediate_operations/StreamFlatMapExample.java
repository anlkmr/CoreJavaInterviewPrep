package com.java.CoreJavaInterviewPrep.java8.stream_intermediate_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFlatMapExample {

    public static void main(String[] args) {
        Stream<List<String>> namesOriginalList = Stream.of(
                Arrays.asList("Pankaj"),
                Arrays.asList("David", "Lisa"),
                Arrays.asList("Amit"));
//flat the stream from List<String> to String stream
        Stream<String> flatStream = namesOriginalList
                .flatMap(strList -> strList.stream());

        flatStream.forEach(System.out::println);

        Stream<List<String>> listStream = Stream.of(Arrays.asList("anil","Kumar"),Arrays.asList("ro","ku"));

        Stream<String> flatStreamw = listStream.flatMap(l->l.stream());
        flatStreamw.forEach(System.out::println);
    }
}
