package com.java.CoreJavaInterviewPrep.java8.stream_intermediate_operations;

import com.java.CoreJavaInterviewPrep.model.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSortedExample {

    public static void main(String[] args){

        Stream<String> names2 = Stream.of("aBc", "d", "ef", "123456");
        List<String> reverseSorted = names2.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSorted); // [ef, d, aBc, 123456]

        Stream<String> names3 = Stream.of("aBc", "d", "ef", "123456");
        List<String> naturalSorted = names3.sorted().collect(Collectors.toList());
        System.out.println(naturalSorted); //[123456, aBc, d, ef]

    //TODO Sort Stream Elements in Custom Order using Comparator
        List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);

        Comparator<Integer> reverseComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                //return i2.compareTo(i1);
                return i1.compareTo(i2);//straight order
                //return -i2.compareTo(i1);//straight order
            }
        };

        List<Integer> sortedList = list.stream()
                .sorted(reverseComparator)
                .collect(Collectors.toList());

        System.out.println(sortedList);
    //TODO Stream Sorting using Lambda Expressions
        List<Integer> list2 = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);

        List<Integer> sortedList2 = list.stream()
                .sorted( (i1, i2) -> i2.compareTo(i1) )
                .collect(Collectors.toList());

        System.out.println(sortedList);

    //TODO If your list is a list of user defined objects, then:
        List<Person> personList = Arrays.asList(new Person(1000, "First", 25, 30000),
                new Person(2000, "Second", 30, 45000),
                new Person(3000, "Third", 35, 25000));
        Stream<Person> personStream = Stream.of(new Person(1000, "First", 25, 30000),
                new Person(2000, "Second", 30, 45000),
                new Person(3000, "Third", 35, 25000));
        //Creating comparator on fly:
        personList.stream().sorted((p1, p2) -> ((Long)p1.getPersonId()).compareTo(p2.getPersonId()))
                .forEach(person -> System.out.println(person.getName()));

        //Using Comparator.comparingLong() method(We have comparingDouble(), comparingInt() methods too):
        personList.stream().sorted(Comparator.comparingLong(Person::getPersonId)).forEach(person -> System.out.println(person.getName()));

        //Using Comparator.comparing() method(Generic method which compares based on the getter method provided):
        personList.stream().sorted(Comparator.comparing(Person::getPersonId)).forEach(person -> System.out.println(person.getName()));

        //We can do chaining too using thenComparing() method:
        //personStream.sorted(Comparator.comparing(Person::getPersonId).thenComparing(Person::getAge)).forEach(person -> System.out.println(person.getName())); //Sorting by person id and then by age.
        personStream.sorted((p1,p2)->((Double)p1.getSalary()).compareTo((Double) p2.getSalary())).forEach(person -> System.out.println(person.getName()));
    }

}


