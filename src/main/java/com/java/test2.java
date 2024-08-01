package com.java;

import java.util.Arrays;
import java.util.stream.Collectors;

public class test2 {

    public static void main(String[] args){

//List ints 1 2 3 4 5 6 7

  Arrays.asList(1,2,3,4,5,6).stream().map(x -> x*2).collect(Collectors.toList()).forEach(System.out::print);


    }
}
