package com.lyh.java;

import com.lyh.bean.Customer;

import java.util.ArrayList;
import java.util.Spliterator;

/**
 * Created by Administrator on 2020-02-04 17:18.
 */
public class TemplateTest {

    // prsf
    private static final int NUM = 1;
    private static final Customer cus = new Customer();
    // psf
    public static final String NAME = "Jhon";
    // psfi  psfs
    public static final String ADDRESS = "chengdu";

    // psvm
    public static void main(String[] args) {
        // sout
        System.out.println("Hello World.");
        // soutp、soutm、soutv、xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplateTest.main");

        System.out.println("args = " + args);
        int num = 10;
        System.out.println("num = " + num);

        ArrayList<Object> list = new ArrayList<>();
        // fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }
        // iter
        for (Object l : list) {

        }
        // itar
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

        }

        // ifn
        if (list == null) {

        }
        // inn
        if (list != null) {

        }
        // xx.nn   xx.null
        if (list != null) {

        }
        if (list == null) {

        }
        Spliterator<Object> spliterator = list.spliterator(); // alt + enter 生成返回值变量


    }
    
    public static void test(){
        System.out.println();
    }


}
