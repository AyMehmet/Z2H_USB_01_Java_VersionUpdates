package com.cydeo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("how to access  a constant");

        Currency c=Currency.DIME;
        System.out.println(c);

        Currency[] currencies=Currency.values();

        for (Currency each:currencies) {
            System.out.println(each);
        }

        Arrays.stream(currencies).forEach(System.out::println);
    }
}
