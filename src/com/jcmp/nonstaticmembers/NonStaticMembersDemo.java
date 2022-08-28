package com.jcmp.nonstaticmembers;

/*
Created by J.Fırat ©
    Date : 28.08.2022
    Time : 23:35
*/
//Static --> NonStatic --> Constructor
public class NonStaticMembersDemo {
    int num;

    public NonStaticMembersDemo() {
        System.out.println("Constructor");
    }

    {
        System.out.println("Inside the Initializer (Non-Static) block");
    }

    public static void main(String[] args) {
        System.out.println("Inside the Main Method");
        new NonStaticMembersDemo();
    }
}
