package com.thetestingacademy.testng._practice;

public class NonStaticClass {

       private String name;

       NonStaticClass(String name){
           this.name = name;
       }

       void printInfo(){
           System.out.println("Your name is  " + this.name);
       }

}
