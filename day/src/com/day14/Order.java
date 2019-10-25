package com.day14;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order<T> {
    private String orderName;
    private int orderId;
    private T t;
    List<T> list = new ArrayList<>();

    void add(){
        list.add(t);

    }
    T getT(){
        return t;
    }
    void setT(T t){
        this.t = t;
    }
    <E> E getE(E e){
        return e;
    }
    <E> List<E> fromArrayToCollection(E[] e, List<E> list){
        list.addAll(Arrays.asList(e));
        return list;
    }
    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", orderId=" + orderId +
                ", t=" + t +
                '}';
    }
}
class SubOrder extends Order<Integer>{

}