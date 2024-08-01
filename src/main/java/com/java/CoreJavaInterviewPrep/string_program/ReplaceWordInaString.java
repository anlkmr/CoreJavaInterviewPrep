package com.java.CoreJavaInterviewPrep.string_program;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class ReplaceWordInaString {

    public static void main(String[] args){

        String input = "Process finished with exit code 0";

        List<String> toRemoveList = Arrays.asList("with","exit");
        AtomicInteger count = new AtomicInteger();

        var collect = Arrays.stream(input.split(" "))
                .map(x -> {if(toRemoveList.contains(x)){
                    count.getAndIncrement();
                    return "Jai";
                }else {
                    return x;
                }
                })
                .collect(Collectors.joining(" "));

        System.out.println(collect);
        System.out.println("count: "+count);
    }



}
