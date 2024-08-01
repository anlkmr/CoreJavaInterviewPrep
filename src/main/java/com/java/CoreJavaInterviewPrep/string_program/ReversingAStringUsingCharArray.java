package com.java.CoreJavaInterviewPrep.string_program;

public class ReversingAStringUsingCharArray {

    String s = "Anil";
    static String s1 = "Kumar";

    public static void main(String[] args){
        char[] charArray = s1.toCharArray();

       /* for (char c : charArray){
            System.out.println(c);
        }*/

        for (int i = charArray.length-1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }

}
