package com.java.CoreJavaInterviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1_6pm {
    public static void main(String[] args) {



        List<List<Integer>> lists = Arrays.asList(Arrays.asList(1,2,3),
                Arrays.asList(2,3,4,5), Arrays.asList(5,7,8));

        //result = 1,2,3,4,5,7,8
        //Don’t use set, hashset and linked hashset

        List<Integer> result = lists.stream().flatMap(List::stream).distinct().collect(Collectors.toUnmodifiableList());


        System.out.println(result);
    }
}
//  Select Distinct salary From Employees ORDER BY salary DESC LIMIT 1 OFFSET 2;
