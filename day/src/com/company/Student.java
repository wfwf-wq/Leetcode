package com.company;

import java.util.Objects;

public class Student implements Comparable{
    private String name;
    private int age;

    public Student(){}

    Student(String name, int age){
        super();
        this.name=name;
        this.age=age;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(String wo){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return "Student[name="+ name+",age="+age+"]";
    }



    public void show(){
        System.out.println(name+","+age);
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Student){
            Student t =(Student)o;
//            return this.name.compareTo(t.name);
            if((this.age-t.age==0))
                return this.name.compareTo(t.name);
            return this.age-t.age;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
