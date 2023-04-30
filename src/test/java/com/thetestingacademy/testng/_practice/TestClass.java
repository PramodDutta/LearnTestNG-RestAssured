package com.thetestingacademy.testng._practice;
import static com.thetestingacademy.testng._practice.StaticMembers.*;

public class TestClass {

    public static void main(String[] args) {

        NonStaticClass nonStaticClass = new NonStaticClass("Pramod");
        nonStaticClass.printInfo();
        //nonStaticClass.name;

        String name1 = name;
        printName();



    }
}
