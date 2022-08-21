package com.cydeo.selfpackage;

public class PrintUpperCase implements Printable{
    @Override
    public void print(String s) {
        System.out.println(s.toUpperCase());
    }
}
