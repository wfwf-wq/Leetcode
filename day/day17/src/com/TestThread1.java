package com;
//通过实现的方式创建多线程
/*
对比一下继承和实现的方式
1.联系：public calss Thread implements Runnable
2.哪个方式好？实现的方式优于继承的方式
    why？避免了java单继承的局限性
        如果多个线程要操作同一份资源，更适合实现的方式
 */
class PrintNum1 implements Runnable{
    public void run(){
        for (int i = 1;i <= 100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
public class TestThread1 {
    public static void main(String[] args) {
        //创建一个Runnable接口实现类的对象
        PrintNum1 p = new PrintNum1();
        //要想启动一个多线程，必须调用start
        //将此对象作为形参传递给Thread类的构造器中，创建Thread类的对象，此对象即为一个线程

        Thread t1 = new Thread(p);
        t1.start();//启动线程，执行Thread对象生成时构造器形参的对象的run方法
        Thread t2 = new Thread(p);
        t2.start();
    }
}
