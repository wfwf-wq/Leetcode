package com.day15;

import java.io.*;
public class TestFileInputOutputStream {
    public static void copyFile(String src, String dest){
        //提供读入，写出的文件
        File file1 = new File(src);
        File file2 = new File(dest);
        //提供相应的流
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            fis = new FileInputStream(file1);
            fos = new FileOutputStream(file2);
            //实现文件的复制
            byte[] b= new byte[8];
            int len;
            while ((len = fis.read(b))!=-1) {
                fos.write(b,0,len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (fos != null){
                try{
                    fos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (fis != null){
                try{
                    fis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    //读取文件并写入到另一个位置
    private static void testFileInputOutputStream(){
        //提供读入，写出的文件
        File file1 = new File("F:\\程序\\Cycle\\data\\apple2orange\\trainA\\1.jpg");
        File file2 = new File("2.jpg");
        //提供相应的流
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            fis = new FileInputStream(file1);
            fos = new FileOutputStream(file2);
            //实现文件的复制
            byte[] b= new byte[8];
            int len;
            while ((len = fis.read(b))!=-1) {
                fos.write(b,0,len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (fos != null){
               try{
                   fos.close();
               }catch (IOException e){
                   e.printStackTrace();
               }
            }
            if (fis != null){
                try{
                    fis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    private static void testFileOutputStream(){
        //创建一个File对象，表明要写入的文件位置
        File file = new File("hello2.txt");
        //创建一个FileOutStream的对象，将file的对象作为形参传递给构造器
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            //写入的操作
            fos.write(new String("aini guniang!").getBytes());

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭输出流
            if(fos != null){
                try{
                    fos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    private static void testFileInputStream3(){
        FileInputStream fis = null;
        try {
            File file = new File("hello.txt");
            fis = new FileInputStream(file);
            byte[] b = new byte[8];//读取到的数据要写入的数组
            int len;//每次读入到byte中字节的长度
            while((len = fis.read(b))!=-1){
                String str = new String(b, 0,len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //使用try-catch的方式处理如下的异常更合理，保证流的关闭肯定能执行
    public static void testFileInputStream2(){
        FileInputStream fis = null;
        try {
            File file = new File("hello.txt");
            fis = new FileInputStream(file);
            int b;
            while ((b=fis.read())!=-1){
                System.out.println((char)b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void testFileInputStream1() throws IOException {
        //创建一个File类的对象
        File file = new File("hello.txt");
        //创建一个对象
        FileInputStream fis = new FileInputStream(file);
        //实现读取
        /*
        read():读取文件中一个字节。结尾就返回-1
         */
        int b = fis.read();
        while (b != -1){
            System.out.print((char)b);
            b = fis.read();
        }

        //关闭相应的流
        fis.close();

    }

    public static void main(String[] args) {
        testFileInputOutputStream();
    }
}
