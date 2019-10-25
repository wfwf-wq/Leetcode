package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;


public class TestMap {
    private static void test1() throws FileNotFoundException, IOException {
        Properties pros = new Properties();
        pros.load(new FileInputStream(new File("jdbc.properties")));
        String user = pros.getProperty("user");
        System.out.println(user);
        System.out.println(pros.getProperty("password"));
    }
    public static void main(String[] args) throws IOException {
        test1();
    }
}
