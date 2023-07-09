package com.thetestingacademy._practice.july23.customAnnotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface FailInfoCustomAnnotate {
    String[] testName() default "testName";
    int lineNumber() default 0;
}
