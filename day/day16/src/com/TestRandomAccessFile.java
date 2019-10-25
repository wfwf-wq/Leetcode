package com;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
1.既可以充当输入流，也可以充当一个输出流
2.支持从文件的开头读取、写入
3.支持从某一位置读取、写入
 */
public class TestRandomAccessFile {
    //读取的文件有好几行的情况
    private static void test4(){
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(new File("test3.txt"),"rw");
            raf.seek(4);
            byte[] b = new byte[10];
            int len;
            StringBuffer sb = new StringBuffer();
            while((len=raf.read(b))!=-1){
                sb.append(new String(b,0,len));

            }
            raf.seek(4);
            raf.write("xy".getBytes());
            raf.write(sb.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if (raf!=null){
                try {
                    raf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private static void test3(){
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(new File("test3.txt"),"rw");
            raf.seek(4);
            String str = raf.readLine();
            raf.seek(4);
            raf.write("xy".getBytes());
            raf.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if (raf!=null){
                try {
                    raf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private static void test2(){
        //实现覆盖效果
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(new File("test3.txt"),"rw");
            raf.seek(4);
            raf.write("sg".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if (raf!=null){
                try {
                    raf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    private static void test1(){
        RandomAccessFile raf1 = null;
        RandomAccessFile raf2 = null;
        try {
            raf1 = new RandomAccessFile(new File("test.txt"),"r");
            raf2 = new RandomAccessFile(new File("test3.txt"),"rw");
            byte[] b= new byte[20];
            int len;
            while ((len=raf1.read(b))!=-1){
                raf2.write(b,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (raf1!=null){
                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (raf2!=null){
                try {
                    raf2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        test4();
    }
}
