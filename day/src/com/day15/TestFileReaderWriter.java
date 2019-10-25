package com.day15;

import java.io.*;

public class TestFileReaderWriter {
    private static void testFileReaderWriter(){
        FileReader fr = null;
        FileWriter fw = null;
        try{
            File src = new File("1.txt");
            File dest = new File("2.txt");
            fr = new FileReader(src);
            fw = new FileWriter(dest);
            char[] c= new char[24];
            int len;
            while((len=fr.read(c))!=-1){
                fw.write(c,0,len);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            if(fw!=null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fr!=null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private static void testFileReader(){
        FileReader fr = null;
        try {
            File file = new File("1.txt");
            fr = new FileReader(file);
            char[] c = new char[24];
            int len;
            while((len=fr.read(c))!= -1){
                String str = new String(c,0,len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fr!=null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        testFileReaderWriter();
    }
}
