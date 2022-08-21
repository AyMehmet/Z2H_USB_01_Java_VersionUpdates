package com.cydeo.selfpackage;

public class PrintLowerCase implements Printable{
    @Override
    public void print(String s) {
        System.out.println(s.toLowerCase());
    }
}
