package com.thetestingacademy.testng.instance;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;


public class FactoryDemo {

    String name;

    FactoryDemo(String name){
        this.name = name;
    }

    @Factory
    public Object[] createInstance() throws Exception{

        Object[] objects = new Object[4];
        for (int i = 0; i < 4; i++) {
            objects[i] = new FactoryDemo("U ->"+i);
        }
        return objects;
    }

    @Test
    public  void checkInstance(){
        System.out.println("Thread - > "+Thread.currentThread().getId()) ;
    }
}
