package com.company;

import java.util.*;

public class StudentDemo {
    private static  void test2(){
        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Customer && o2 instanceof Customer){
                    Customer c1 = (Customer)o1;
                    Customer c2 = (Customer)o2;
                    int i = c1.getId().compareTo(c2.getId());
                    if(i==0){
                        return c1.getName().compareTo(c2.getName());
                    }
                    return i;
                }
                return 0;
            }
        };
        TreeSet<Customer> set = new TreeSet<Customer>(com);
        set.add(new Customer("aa",23));
        set.add(new Customer("bb",25));
        set.add(new Customer("gg",24));
        set.add(new Customer("cc",20));
        set.add(new Customer("dd",20));
        for(Object str:set){
            System.out.println(str);
        }
    }
    public static void main(String[] args){
       test2();
    }
}
