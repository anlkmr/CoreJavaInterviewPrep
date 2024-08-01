package com.java.CoreJavaInterviewPrep;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test6 {

    public static void main(String[] args) {
        Integer[] numbers = {2, 4, 7, 2, 8, 10, 7, 15, 18, 7, 9, 7, 25, 36, 46, 50, 21, 2, 15};

        Map<Integer, Long> frequencyMap = Arrays.stream(numbers)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

//Even and Odd numbers
       frequencyMap.keySet().stream().filter(x-> {
           if (!(x.intValue() % 2 == 0)) {
               return true;
           } else {
               return false;
           }
       })
               .map(x -> {
                   if(x>7){
                       return 8;
                   }else {
                       return 7;
                   }
               })
               .sorted(Comparator.naturalOrder()).forEach(x -> System.out.println(x));
    }
}
