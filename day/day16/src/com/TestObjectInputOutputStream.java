package com;

import java.io.*;

public class TestObjectInputOutputStream {
    //对象的反序列化过程
    private static void testObjectInputStream(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("person.txt"));
            Person p1 = (Person)ois.readObject();
            System.out.println(p1);
            Person p2 = (Person)ois.readObject();
            System.out.println(p2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois!=null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    //对象的序列化过程,转化为二进制流
    private static void testObjectOutputStream(){
        Person p1 = new Person("mimi",23);
        Person p2 = new Person("midami",21);
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("person.txt"));
            oos.writeObject(p1);
            oos.flush();
            oos.writeObject(p2);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(oos!=null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public static void main(String[] args) {
        testObjectInputStream();
    }
}
/*
要实现序列化的类：
1.要求此类是可序列化的
2.实现serializable
3.UID
4.不能序列化static和transient修饰的成员变量
 */
class Person implements Serializable {
//    private static final long seriaLVersionUID=6249222908857752844;
     String name;
     Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
