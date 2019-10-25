package com.atguigu.exer;



import sun.reflect.generics.tree.Tree;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestEmployee {
    private static void test2(){
        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Employee1&& o2 instanceof Employee1){
                   Employee1 e1 = (Employee1)o1;
                   Employee1 e2 = (Employee1)o2;
                   MyDate birth1 = e1.getBirthday();
                   MyDate birth2 = e2.getBirthday();
                   if(birth1.getYear()!=birth2.getYear()){
                       return birth1.getYear()-birth2.getYear();
                   }else {
                       if(birth1.getMonth()!=birth2.getMonth()){
                           return birth1.getMonth()-birth2.getMonth();
                       }else {
                           return birth1.getDay()-birth2.getDay();
                       }
                   }
                }
                return 0;
            }
        };
        TreeSet<Object> set1 = new TreeSet(com);
        Employee1 e1 = new Employee1("wangqian",23,new MyDate(8,5,1996));
        Employee1 e2 = new Employee1("wangjiaer",22,new MyDate(9,5,1996));
        Employee1 e3 = new Employee1("wuyanzu",21,new MyDate(1,5,1996));
        Employee1 e4 = new Employee1("pengyuyan",24,new MyDate(2,5,1996));
        Employee1 e5 = new Employee1("lixian",25,new MyDate(3,5,1996));
        set1.add(e1);
        set1.add(e2);
        set1.add(e3);
        set1.add(e4);
        set1.add(e5);
        for(Object o:set1){
            System.out.println(o);
        }
    }
    public static void test1(){
        Employee e1 = new Employee("wangqian",23,new MyDate(8,5,1996));
        Employee e2 = new Employee("wangjiaer",22,new MyDate(9,5,1996));
        Employee e3 = new Employee("wuyanzu",21,new MyDate(1,5,1996));
        Employee e4 = new Employee("pengyuyan",24,new MyDate(2,5,1996));
        Employee e5 = new Employee("lixian",25,new MyDate(3,5,1996));
        TreeSet<Object> set = new TreeSet<>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        for (Object o : set) {
            System.out.println(o);
        }


    }
    public static void main(String[] args){
        test2();
    }

}
