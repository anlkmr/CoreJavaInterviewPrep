package com.java.CoreJavaInterviewPrep.java8.stream_intermediate_operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterExample {
// TODO filter(Predicate<? super T> predicate)
    //predicate gives boolean return for a condition.
    public static void main(String[] args){
        List<Integer> myList = new ArrayList<>();
        for(int i=0; i<100; i++) myList.add(i);
        Stream<Integer> sequentialStream = myList.stream();
        Stream<Integer> sequentialStream2 = myList.stream();

        Stream<Integer> highNums = sequentialStream.filter(p -> p > 90); //filter numbers greater than 90

        System.out.print("High Nums greater than 90 are ");
        highNums.forEach(p -> System.out.print(p+" "));
        //Using Foreach
        sequentialStream2.filter(p -> p > 90).forEach(System.out::println);
//prints "High Nums greater than 90=91 92 93 94 95 96 97 98 99 "

//elements divisible by 5
        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);

        // Getting a stream consisting of the
        // elements that are divisible by 5
        // Using Stream filter(Predicate predicate)
        list.stream()
                .filter(num -> num % 5 == 0)
                .forEach(System.out::println);

//elements with an upperCase letter at index 1
        Stream<String> stream = Stream.of(
                "Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks");

        // Getting a stream consisting of the
        // elements having UpperCase Character
        // at custom index say be it '1'
        // using Stream filter(Predicate predicate)
        stream
                .filter(
                        str -> Character.isUpperCase(str.charAt(1)))
                .forEach(System.out::println);

//elements ending with custom alphabetically letter say it be ‘s’ for implementation purposes.
        Stream<String> streamLetters = Stream.of(
                "Geeks", "foR", "GeEksQuiz", "GeeksforGeeks");

        // Getting a stream consisting of the
        // elements ending with 's'
        // using Stream filter(Predicate predicate)
        streamLetters.filter(str -> str.endsWith("s"))
                .forEach(System.out::println);

//RangeFilterAndSortExample
        List<Integer> numbers = Arrays.asList(10, 25, 30, 45, 60, 70, 80);

        List<Integer> filteredAndSortedNumbers = numbers.stream()
                .filter(n -> n >= 20 && n <= 50)  // Filter elements within the range
                .sorted()                          // Sort in ascending order
                .collect(Collectors.toList());    // Collect into a List

        System.out.println("Filtered and sorted numbers: " + filteredAndSortedNumbers);
//FilterStringsContainingPattern
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "grape");

        String pattern = "ap";

        List<String> filteredStrings = words.stream()
                .filter(word -> word.contains(pattern))
                .collect(Collectors.toList());

        System.out.println("Strings containing the pattern '" + pattern + "': " + filteredStrings);
//FindElementWithShortCircuiting
        List<String> words2 = Arrays.asList("apple", "banana", "cherry", "date", "grape");

        String target1 = "cherry";

        Optional<String> foundWord = words2.stream()
                .filter(word -> word.equals(target1))
                .findFirst();  // Short-circuiting: stops after finding the first match

        if (foundWord.isPresent()) {
            System.out.println("Found: " + foundWord.get());
        } else {
            System.out.println("Target element " + target1+" not found.");
        }
//ForEach
        List<String> versions = new ArrayList<>();
        versions.add("Lollipop");
        versions.add("KitKat");
        versions.add("Jelly Bean");
        versions.add("Ice Cream Sandwidth");
        versions.add("Honeycomb");
        versions.add("Gingerbread");

        // Using one filter()
        // print all versions whose length is greater than 10 character
        System.out.println("All versions whose length greater than 10");
        versions.stream()
                .filter(s -> s.length() > 10)
                .forEach(System.out::println);

        System.out.println("first element which has letter 'e' ");
        String first = versions.stream()
                .filter(s -> s.contains("e"))
                .findFirst().get();
        System.out.println(first);

        Stream<Integer> s1 = Stream.of(1,2,3);
        //s1.forEach(System.out::println);
        s1.filter(integer -> integer>=2)
                .map(i->i*5)
                .forEach(System.out::println);
    }
}
