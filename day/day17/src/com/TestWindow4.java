package com;
//存在线程的安全问题，打印车票时会出现重票、错票
/*
1.线程安全问题存在的原因？
        由于一个线程在操作共享数据过程中，未执行完毕的情况下，另外的
    线程参与进来，导致共享数据存在了安全问题。
2.如何解决线程的安全问题？
    必须让一个线程操作共享数据完毕以后，其他线程才有机会参与共享数据的操作
3.java如何实现线程的安全：线程的同步机制
    方式一：同步代码块
    synchronized(同步监视器){
        //需要被同步的代码块（即为操作共享数据的代码）
    }
    1.共享数据：多个线程共同操作的同一个数据（变量）
    2.同步监视器：由任何一个类的对象来充当，哪个线程获取监视器，就执行。俗称：锁
     方式二：同步方法
     同步方法的锁：this
 */
class Window4 implements Runnable{
    private int ticket = 100;//共享数据
    public void run(){
        while (true){
            show();
        }
    }
    private synchronized void show(){
        if (ticket>0){
//                try{
//                    Thread.sleep(10);
//                }catch (InterruptedException e){
//                    e.printStackTrace();
//                }
            System.out.println(Thread.currentThread().getName()+":"+ticket--);
        }
    }
}
public class TestWindow4 {
    public static void main(String[] args) {
        Window4 w = new Window4();
        Thread p1 = new Thread(w);
        Thread p2 = new Thread(w);
        Thread p3 = new Thread(w);
        p1.setName("窗口1");
        p2.setName("窗口2");
        p3.setName("窗口3");
        p1.start();
        p2.start();
        p3.start();
    }
}
