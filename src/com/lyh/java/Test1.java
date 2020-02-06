package com.lyh.java;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Administrator on 2020-02-03 16:55.
 */
public class Test1 {

    private static final int TEN_NUM = 10;

    public static void main(String[] args) {
        System.out.println("hh");
        print();

//        sout

        Date date = new Date();

        /*try {
            FileInputStream fis = new FileInputStream("test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/

    }

    private static void print() {
        //region Description
        System.out.println("hh");
        System.out.println("hh");
        System.out.println("hh");
        System.out.println("hh");
        System.out.println("hh");

        ArrayList<Object> list = new ArrayList<>();
        //endregion
        list.add("333");
        System.out.println(list);
    }

    private static void error() {
//        FileInputStream fis = new FileInputStream("test.txt");
    }

}
