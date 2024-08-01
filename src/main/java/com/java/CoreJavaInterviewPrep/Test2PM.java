package com.java.CoreJavaInterviewPrep;

import com.java.CoreJavaInterviewPrep.model.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test2PM {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<Person>();

        Person person1 = new Person(1L,"Arav",20,10000);
        Person person2 = new Person(2L,"kumar",22,15000);
        Person person3 = new Person(3L,"Kranti",27,7000);
        Person person4 = new Person(1L,"Arav",20,23000);
        Person person5 = new Person(1L,"Arav",20,27000);

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);

       // personList.sort(Comparator.comparing(Person::getName));

       /* personList.stream()//.sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .sorted(Comparator.comparingDouble(Person::getSalary).reversed())
                .collect(Collectors.toList()).forEach(person -> System.out.println(person.toString()));
*/
        personList.sort(
                Comparator.comparing(Person::getName)
                        .thenComparing(Person::getSalary, Comparator.reverseOrder())
                        );
        personList.stream().collect(Collectors.toList()).forEach(person -> System.out.println(person.toString()));


        // sort by name first then sort by salary descending order.



    }
}
