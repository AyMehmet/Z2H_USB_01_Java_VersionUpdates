package com.cydeo;

public enum Operation {

    PLUS,MINUS,DIVIDE,MULTIPLY;

    private Operation() {
        System.out.println("Constructor");
    }
}
