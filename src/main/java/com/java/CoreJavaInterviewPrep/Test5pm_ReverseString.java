package com.java.CoreJavaInterviewPrep;

import java.util.stream.Stream;

public class Test5pm_ReverseString {


    public static void main(String[] args) {

        String name = "welcome";
        char[] splitChars = name.toCharArray();

        //String[] splitChars = name.split("");
        //String[] reverseChars = new String[splitChars.length];
        char[] reverseChars = new char[splitChars.length];
        int reverseIndex = splitChars.length-1;
        for (int i = 0; i < splitChars.length; i++) {

            //for (int j=reverseIndex; j>0;j--){

            reverseChars[reverseIndex]=splitChars[i];
            reverseIndex--;
            //}


        }
        Stream.of(reverseChars).forEach(System.out::println);


    }
}
