package com.jcmp.staticmembers;

/*
Created by J.Fırat ©
    Date : 28.08.2022
    Time : 23:18
*/

//Static blocks are executed when the class is loaded.
//Main Method is static method.
public class StaticBlocksDemo {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    static {
        System.out.println("Static block 1");
    }
    static {
        System.out.println("Static block 2");
    }
}
