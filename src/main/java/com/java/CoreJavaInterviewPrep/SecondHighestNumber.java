package com.java.CoreJavaInterviewPrep;

public class SecondHighestNumber {


    public static void main(String[] args) {

        int[] numbersCustom = {1, 2, 3, 4, 5, 10, 8, 99, -5, -4};


        //Second Highest
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int number : numbersCustom) {

            if (number > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = number;
            } else if (number > secondHighest && number != firstHighest) {

                secondHighest = number;

            }


        }
        System.out.println("Second Highest int : " + secondHighest);
    }


}
