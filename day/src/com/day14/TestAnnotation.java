package com.day14;

import java.util.ArrayList;
import java.util.List;

public class TestAnnotation {
    public static void main(String[] args) {
        Person p = new Student();
        p.walk();
        List list = new ArrayList();
    }
}
class Student extends Person{
    @Override
    public void walk(){
        System.out.println("xueshengzoulu");
    }
    @Override
    public void eat(){
        System.out.println("xueshengchifan");
    }
}

class Person{
    String name;
    int age;
    public void walk(){
        System.out.println("zoulu");
    }
    public void eat(){
        System.out.println("chifan");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}