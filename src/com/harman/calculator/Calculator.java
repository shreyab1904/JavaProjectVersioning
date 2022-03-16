package com.harman.calculator;

public class Calculator {
    public static void main(String[] args) {
        Subtraction subc=new Subtraction();
        int a=10,b=10,c;
        c=a+b;
        System.out.println(c);
        int result=subc.sub(a,b);
        System.out.println(result);
    }
}
