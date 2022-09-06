package com.jcmp.dataexperience;

/*
Created by J.Fırat ©
    Date : 6.09.2022
    Time : 20:22
*/
public class VariablesExamplesDemo {
    //Class Level Variables
    static String bankName = "Türkiye İş Bankası";
    //Non-Static Variables Heap Memory
    String accountHolderName;
    String accountNumber;
    float balance; //default value 0.0
    public static void main(String[] args) {
        double interestRate = 1.5; //Local Variables Stack Memory
        System.out.println(VariablesExamplesDemo.bankName);
        VariablesExamplesDemo obj = new VariablesExamplesDemo();
        obj.accountHolderName = "J.Fırat";
        obj.accountNumber = "123456789";
        obj.balance = 1000;
        System.out.println(obj.accountHolderName);
        System.out.println(obj.accountNumber);
        System.out.println(obj.balance);
    }
}
