package com.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {

 public static void main(String[] args) {

  List<Integer> listNumber = Arrays.asList(1, 2, 3, 4, 2, 3, 4, 1);
  List<Integer> listNumberResutl =listNumber.stream().distinct().collect(Collectors.toList());

  Collections.reverse(listNumberResutl);
  System.out.println(listNumberResutl);
 }

}

