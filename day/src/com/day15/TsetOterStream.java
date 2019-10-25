package com.day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TsetOterStream {
    private static void test(){
        BufferedReader br = null;
        try {
            InputStream is = System.in;
            InputStreamReader isr = new InputStreamReader(is);
            br = new BufferedReader(isr);
            System.out.println("input:");
            String str;
            while(true){
                str = br.readLine();
                if(str.equalsIgnoreCase("e")||str.equalsIgnoreCase("exit")){
                    break;
                }
                String str1 = str.toUpperCase();
                System.out.println(str1);
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

    public static void main(String[] args) {
        test();
    }
}
