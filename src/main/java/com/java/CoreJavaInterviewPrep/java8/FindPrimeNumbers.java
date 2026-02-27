package com.java.CoreJavaInterviewPrep.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindPrimeNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> primes = numbers.stream()
                .filter(FindPrimeNumbers::isPrime)
                .collect(Collectors.toList());

        System.out.println("Prime numbers: " + primes);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number <= 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) return false;
        }
        return true;
    }





}
