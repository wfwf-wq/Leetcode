package com;
/*
创建一个子线程，完成1-100之间自然数的输出
同样的，主线程执行同样的操作
集成java。lang。Thread类
 */
//创建一个集成于Thread的子类
class SubThread extends Thread{
    //重写Thread类的run方法,方法内实现子线程完成的功能
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
public class TestThread {
    public static void main(String[] args) {
        //创建一个子类的对象
        SubThread st = new SubThread();
        SubThread st2 = new SubThread();
        //调用线程的start，启动此县城；调用相应的run方法
        //不能通过Thread实现类对象的run（）启动一个线程
        st.start();
        st2.start();
        for(int i=1;i<=100;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
