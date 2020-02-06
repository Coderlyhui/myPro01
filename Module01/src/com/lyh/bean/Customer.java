package com.lyh.bean;

/**
 * Created by Administrator on 2020/2/3.
 */
public class Customer {

    /**
     *id
     */
    private String id;
    /**
     *age
     */
    private int age;
    /**
     *del
     */
    private boolean del;

    public Customer() {
    }

    public Customer(String id, int age, boolean del) {
        this.id = id;
        this.age = age;
        this.del = del;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDel() {
        return del;
    }

    public void setDel(boolean del) {
        this.del = del;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", age=" + age +
                ", del=" + del +
                '}';
    }
}
