package com.java.CoreJavaInterviewPrep.java8;

import lombok.extern.log4j.Log4j2;

import java.util.*;
import java.util.stream.*;

@Log4j2
public class Streams_P {

    public static void main(String[] args){



        List<Integer> myList = new ArrayList<>();
        for(int i=0; i<100; i++) myList.add(i);

//sequential stream
        Stream<Integer> sequentialStream = myList.stream();

//parallel stream
        Stream<Integer> parallelStream = myList.parallelStream();

        Stream<String> stream1 = Stream.generate(() -> {return "abc";});
        Stream<String> stream2 = Stream.iterate("abc", (i) -> i);

        LongStream is = Arrays.stream(new long[]{1,2,3,4});
        IntStream is2 = "abc".chars();

        Stream<Integer> intStream = Stream.of(1,2,3,4,5,6,7,8,9);
        Integer[] integers1 = intStream.toArray(Integer[]::new);
        System.out.println(Arrays.toString(integers1));
      /*  List<Integer> intList = intStream.collect(Collectors.toList());
        System.out.println(intList); //prints [1, 2, 3, 4]


        intStream = Stream.of(1,2,3,4); //stream is closed, so we need to create it again
        Map<Integer,Integer> intMap = intStream.collect(Collectors.toMap(i -> i, i -> i+10));
        System.out.println(intMap); //prints {1=11, 2=12, 3=13, 4=14}
*/
        //Map<Integer,Integer> map = intStream.collect(Collectors.toMap(i -> i, i -> i + 1));




        List<Integer> integers = Arrays.asList(1, 2, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> intStream1 = integers.stream();
        Stream<Integer> intStream2 = integers.stream();
        List collect = intStream1.collect(Collectors.toList());
        System.out.println("welcome");

        Stream<String> s1 = Stream.of("Apple","Boy","Cat","Dog","Elephat");
        for (String s : s1.map(String::toUpperCase)
                .collect(Collectors.toList())) {
            System.out.println(s);
        }

    }

}
