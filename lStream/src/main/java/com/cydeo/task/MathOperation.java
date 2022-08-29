package com.cydeo.task;

import java.util.Arrays;
import java.util.List;

public class MathOperation {

    public static void main(String[] args) {
        List<Integer> numList= Arrays.asList(1,2,3,4,5);
        System.out.println(numList.stream()
                .mapToInt(Integer::intValue)
                .sum());



    }


    public static int sum(Integer i){
        int result=0;
        return result=result+i;
    }
}
