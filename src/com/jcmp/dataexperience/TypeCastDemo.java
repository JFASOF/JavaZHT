package com.jcmp.dataexperience;

/*
Created by J.Fırat ©
    Date : 6.09.2022
    Time : 20:07
*/
//Implicit Casting (Lower to Higher)
//Explicit Casting (Higher to Lower)

class ImplicitCast{
    byte b = 100;
    int i = b;
    long l = i;
    char c = 'A';
    int i2 = c;
}

class ExplicitCast{
    int i = 100;
    byte b = (byte) i;
    long l = 1000000000000000000L;
    int i2 = (int) l;
    char c = 'A';
    int i3 = (int) c;
}

public class TypeCastDemo {
    public static void main(String[] args) {
        ImplicitCast obj1 = new ImplicitCast();
        System.out.println(obj1.i);
        System.out.println(obj1.l);
        System.out.println(obj1.i2);
        ExplicitCast obj2 = new ExplicitCast();
        System.out.println(obj2.b);
        System.out.println(obj2.i2);
        System.out.println(obj2.i3);
    }
}
