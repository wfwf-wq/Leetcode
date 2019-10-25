package com.day15;

import java.io.*;

public class TestBuffered {
    //实现非文本文件的复制
    private static void testBufferedInputOutputStream() {
        BufferedReader br = null;
        try {
            File file1 = new File("hello.txt");
            //提供相应的流
            FileReader fr = new FileReader(file1);
            br = new BufferedReader(fr);

            String str=null;
            while((str = br.readLine())!=null){

            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }

    public static void main(String[] args) {
        testBufferedInputOutputStream();
    }
}
