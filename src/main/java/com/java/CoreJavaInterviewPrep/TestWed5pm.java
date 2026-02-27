package com.java.CoreJavaInterviewPrep;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class TestWed5pm {

    public static void main(String[] args) {

        // leetcod // ({})


        isValid("test");
    }

    private static boolean isValid(String sinput) {


        Map<Character, Character> collect = new HashMap<>();

        collect.put(')','(');

        collect.put('}','{');

        collect.put(']','[');

        Stack<Character> stack = new Stack<>();

        for (char c : sinput.toCharArray())
        {
            if(collect.containsKey(c)){

                char topElement = stack.isEmpty() ? '#' : stack.pop();

                if (topElement != collect.get(c)){
                    return false;
                }

            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();

    }
}
