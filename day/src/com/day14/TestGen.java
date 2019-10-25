package com.day14;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TestGen {
    /*
    集合中使用泛型
    自定义泛型类、泛型方法
    泛型和继承
    通配符
     */
    public static void test4(){
        Order<Boolean> order = new Order<Boolean>();
        order.setT(true);
        System.out.println(order.getT());
        order.add();
        List<Boolean> list = order.list;
        System.out.println(list);

        SubOrder o = new SubOrder();
        List<Integer> list1 = o.list;
        System.out.println(list1);
        Integer i = order.getE(34);
        Double d = order.getE(2.3);
        Integer[] in = new Integer[]{1,2,3};
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = order.fromArrayToCollection(in, list2);
        System.out.println(list3);
    }
    public static void test5(){
        Object obj = null;
        String str = "aa";
        obj = str;

    }
    public static void main(String[] args){
        test4();
    }
}
