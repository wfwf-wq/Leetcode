package com.day15;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Date;

public class TestFile {
    public static void test1() throws IOException {
        File file1 = new File("F:\\javafile\\day\\io\\hello.txt");
        File file2 = new File("F:\\javafile\\day\\io\\io1");
        System.out.println(file1.delete());
        if(!file1.exists()){
            boolean b = file1.createNewFile();
            System.out.println(b);
        }
        File file3 = new File("f:\\javafile\\day\\io\\");
        File[] file = file3.listFiles();
        assert file != null;
        for (File value : file) {
            System.out.println(value.getName());
        }
    }

    public static void main(String[] args) throws IOException {
        test1();
    }
}
