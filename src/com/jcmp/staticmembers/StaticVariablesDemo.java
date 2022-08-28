package com.jcmp.staticmembers;

/*
Created by J.Fırat ©
    Date : 28.08.2022
    Time : 23:24
*/

//Static variables are default values 0 for int, false for boolean, null for object, etc.
public class StaticVariablesDemo {
    static int num;
    static boolean bool;
    static String str;
    public static void main(String[] args) {
        System.out.println(StaticVariablesDemo.num);
        System.out.println(StaticVariablesDemo.bool);
        System.out.println(StaticVariablesDemo.str);
    }
}
