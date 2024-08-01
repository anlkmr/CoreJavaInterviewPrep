package com.java.CoreJavaInterviewPrep;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test5 {
    //Ex:- String str="ABCDDEFEFGGH" Answer is D and G

    public static void main(String[] args){

        String str ="ABCDDEFEFGGH";

        //cmpany - branches top 5 branches highes sals

        List<String> characters = Arrays.asList(str.split("")); //need to use map
        //stream.sort((c1,c2) -> c1.branch.salary.comparedto(c2.branch.salary)).descending order . limit top 5 ).for

        String result = IntStream.range(0,characters.size()-1)
                .filter(x -> characters.get(x).equals(characters.get(x+1)))
                .mapToObj(characters::get).collect(Collectors.joining());

        System.out.println(result);

    }

}
