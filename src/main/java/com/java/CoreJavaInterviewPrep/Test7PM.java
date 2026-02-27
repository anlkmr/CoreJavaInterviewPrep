package com.java.CoreJavaInterviewPrep;

import java.util.Arrays;
import java.util.List;

public class Test7PM {

    public static void main(String[] args) {

        // 12,15,23,97

        List<Integer> numbers = Arrays.asList(12,15,19,23,197);

        int summed = numbers.stream().filter(Test7PM::isPrime).mapToInt(Integer::intValue).sum();

        System.out.println(summed);
    }

    private static boolean isPrime(int num){

        if(num <= 1) return false;
        if(num ==2)  return true;
        if(num %2 ==0) return false;

        for(int i =3; i<= Math.sqrt(num); i+=2){

            if(num % i ==0){
                return false;
            }
        }
        return true;
    }

}
