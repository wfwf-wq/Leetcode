package com;

import java.io.*;

public class TestExer {
    //字符流实现复制
    private static void test4(){
        BufferedReader br = null;
        BufferedWriter bw = null;
        try{
            br = new BufferedReader(new FileReader(new File("test.txt")));
            bw = new BufferedWriter(new FileWriter(new File("test2.txt")));
            char[] c= new char[20];
            int len;
            while((len=br.read(c))!=-1){
                bw.write(c,0,len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //使用字符流实现内容读入
    private static void test3(){
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("test.txt"));
            String str;
            while ((str=br.readLine())!=null){
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    //使用字符流实现内容输出
    private static void test2(){
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("test1.txt"));
            String str="我是你爸爸，你是我儿子，我是你爷爷，你是我孙子";
            bw.write(str);
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //使用字节流输出
    private static void test1(){
        BufferedOutputStream bos = null;
        try {
            FileOutputStream fos = new FileOutputStream(new File("test.txt"));
            bos = new BufferedOutputStream(fos);
            String str="我是你爸爸，你是我儿子，我是你爷爷，你是我孙子";
            bos.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(bos!=null){
                try {
                    bos.close();
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
