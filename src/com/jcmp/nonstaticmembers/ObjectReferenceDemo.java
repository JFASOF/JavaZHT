package com.jcmp.nonstaticmembers;

/*
Created by J.Fırat ©
    Date : 5.09.2022
    Time : 23:10
*/
//Create a object reference
class ObjectReferenceDemo {
    int num;
    ObjectReferenceDemo(){

    }
}

//Create object reference in a static block
class ObjectReferenceDemo2 {
    static {
    ObjectReferenceDemo2 obj = new ObjectReferenceDemo2();
    System.out.println(obj);
    }
}

//Create a static reference directly
class ObjectReferenceDemo3 {
    static ObjectReferenceDemo3 obj;
    static {
        System.out.println(obj);
        obj = new ObjectReferenceDemo3();
    }
}

class Demo{
    public static void main(String[] args) {
        ObjectReferenceDemo obj1 = new ObjectReferenceDemo();
        System.out.println(obj1.num);
        ObjectReferenceDemo obj2 = new ObjectReferenceDemo();
        System.out.println(obj2);
        System.out.println(ObjectReferenceDemo3.obj);
    }
}