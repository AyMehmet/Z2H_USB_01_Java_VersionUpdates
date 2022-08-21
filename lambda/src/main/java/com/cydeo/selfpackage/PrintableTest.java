package com.cydeo.selfpackage;

public class PrintableTest {

    public static void main(String[] args) {

        Printable lowerCase= s-> System.out.println(s.toLowerCase());
        lowerCase.print("lhkjhEE");

        Printable upperCase=s-> System.out.println(s.toUpperCase());
        upperCase.print("kjkljkj");

        PrintDifferentType("kkkll",new PrintUpperCase());
       PrintDifferentType("KGGGK", new PrintLowerCase());

    }

    public static void PrintDifferentType(String s, Printable printable){
        printable.print(s);
    }
}
