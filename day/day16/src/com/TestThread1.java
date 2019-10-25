package com;
/*
Thread常用方法：
start（）：启动线程并执行相应的run
run（）：子县城要执行的代码放入run方法中
currentThread：静态的，调取当前的线程
getName:获取线程名字
setName：设置线程名字
yield:调用此方法的线程释放当前CPU的执行权
join：在A线程中调用B线程的join方法，A县城停止执行，直至B线程执行完毕，A线程再接着执行
isAlive：判断当前线程是否存活
sleep(long l):显示的让当前线程睡眠l毫秒
线程通信 wait notify notifyAll
设置线程的优先级
 */
class SubThread1 extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
//            try {
//                Thread.currentThread().sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getPriority()+":"+i);
        }
    }
}
public class TestThread1 {
    public static void main(String[] args) {
        //创建一个子类的对象
        SubThread1 st = new SubThread1();
        st.setName("子线程1");
        st.setPriority(Thread.MAX_PRIORITY);
        st.start();
        Thread.currentThread().setName("主线程");
        for(int i=1;i<=100;i++){
            System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getPriority()+":"+i);
//            if(i%10==0){
//                Thread.currentThread().yield();
//            }
//            if(i==20){
//                try {
//                    st.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
        }
        System.out.println(st.isAlive());
    }
}
