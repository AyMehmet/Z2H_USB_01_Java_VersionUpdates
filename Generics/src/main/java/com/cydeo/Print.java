package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class Print {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);

        List<String> list1=new ArrayList<>();
        list1.add("memo");

        printList(list);
        printList(list1);
    }

//    private static <T> void printList(List<T> list) {
//        System.out.println(list);
//    }

    private static void printList(List<?> list){
        System.out.println(list);
    }
}
