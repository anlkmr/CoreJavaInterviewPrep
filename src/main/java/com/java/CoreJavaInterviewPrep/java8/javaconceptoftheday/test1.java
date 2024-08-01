package com.java.CoreJavaInterviewPrep.java8.javaconceptoftheday;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class test1 {

    public static void main(String[] args)
    {
        //extracted1();
        method2();
    }

    private static void method2() {

        List<Integer> toProcessList = Arrays.asList(10,20,30,40,50);

        Map<Boolean, List<Integer>> collect = toProcessList.stream().collect(Collectors.partitioningBy(x -> (x % 2 == 0)));

        System.out.println("collected even numbers: ");
        collect.entrySet().stream().forEach(x -> {if (x.getKey()){
            System.out.println(x.getValue());
        }});
    }

    private static void extracted1() {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        Map<Boolean, List<Integer>> oddEvenNumbersMap =
                //listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
                listOfIntegers.stream().collect(Collectors.partitioningBy(x->(x % 2 == 0)));
        Set<Entry<Boolean, List<Integer>>> entrySet = oddEvenNumbersMap.entrySet();
// two Groups
// true - because condition matching
// true - even numbers
// false - odd numbers
        for (Entry<Boolean, List<Integer>> entry : entrySet)
        {
            System.out.println("--------------");

            if (entry.getKey())
            {
                System.out.println("Even Numbers");
            }
            else
            {
                System.out.println("Odd Numbers");
            }

            System.out.println("--------------");

            List<Integer> list = entry.getValue();

            for (int i : list)
            {
                System.out.println(i);
            }
        }
    }
}
