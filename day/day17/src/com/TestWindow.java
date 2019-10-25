package com;
//模拟火车站售票，开启三个窗口，总票数100张
class Window extends Thread{
    private static int ticket = 100;
    public void run(){
        while (true){
            if (ticket>0){
                System.out.println(Thread.currentThread().getName()+"售票，票号为:"+ticket--);
            }else {
                break;
            }
        }
    }
}
public class TestWindow {
    public static void main(String[] args) {
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();
        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");
        w1.start();
        w2.start();
        w3.start();
    }
}
