/*
package com.java.CoreJavaInterviewPrep;

import java.util.HashMap;
import java.util.Map;

public class Test1 {

    public static void main(String[] args) {
        int[] arrayInt = new int[]{3,2,2,3};

        arrayInt[0] =1;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put()
    }

    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count =0;
        if(nums.length!=0)
            for(int i=0;i<=nums.length;i++){
                for(int n:nums)
                {
                    if(n==nums[i])
                        count++;
                    map.put(nums[i],count);
                }
            }
        Entry<Integer, Integer> maxEntry = map.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow(() -> new IllegalArgumentException("Map is empty"));

        return maxEntry.getKey();
    }
}
*/
