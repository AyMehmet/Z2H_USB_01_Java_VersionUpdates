package com.cydeo;

import com.cydeo.task.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MathOperation {



    public static void main(String[] args) {
        List<Integer> numList= Arrays.asList(1,2,3,4,5);
        System.out.println(numList.stream()
                .mapToInt(Integer::intValue)
                .sum());

        System.out.println(numList.stream().mapToInt(num->num).sum());

        System.out.println(numList.stream().collect(Collectors.summingInt(num->num)));

        List<String> wordList= Arrays.asList("jkhgkjgjk", "kjgkgkgg","ytrytrtrr");
        System.out.println(wordList.stream()
                .map(w->w.startsWith("t"))
                .collect(Collectors.toList()));

        System.out.println(numList.stream().mapToInt(num->num).sum());

        System.out.println(numList.stream().collect(Collectors.summingInt(num->num)));

        List<employe> employe = new ArrayList<>(Arrays.asList(
                new employe("Henry", 45, Arrays.asList("Mike j.", "Anna", "Tim")),
                new employe("Michael", 29, Arrays.asList("Sue", "Tim"))));

        employe.stream()
                .map(employee -> employee.children)
                .forEach(System.out::println);

    }




    public static int sum(Integer i){
        int result=0;
        return result=result+i;
    }
}
