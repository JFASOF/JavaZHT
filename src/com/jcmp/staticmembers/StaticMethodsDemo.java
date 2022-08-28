package com.jcmp.staticmembers;

/*
Created by J.Fırat ©
    Date : 28.08.2022
    Time : 23:21
*/
//Static blocks are executed when the class is loaded.
//Main Method is static method.
//Static Method 1 inside the static block.
public class StaticMethodsDemo {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    static void staticMethod1() {
        System.out.println("Static method 1");
    }
    static{
        System.out.println("Inside the Static block 1");
        StaticMethodsDemo.staticMethod1();
    }
}
