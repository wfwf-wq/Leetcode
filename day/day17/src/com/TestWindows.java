package com;
//存在线程的安全问题，打印车票时会出现重票、错票
class Window1 implements Runnable{
    private int ticket = 100;
    public void run(){
        while (true){
            if (ticket>0){
                System.out.println(Thread.currentThread().getName()+":"+ticket--);
            }else {
                break;
            }
        }
    }
}
public class TestWindows {
    public static void main(String[] args) {
        Window1 w = new Window1();
        Thread p1 = new Thread(w);
        Thread p2 = new Thread(w);
        p1.start();
        p2.start();
    }
}
