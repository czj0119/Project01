package com.idea;

public class HelloWorld {

    public static void main(String[] args){

        System.out.println("Hello World!");
        hello("张三");
        hello("李四");

    }

    //这是一个自定义的方法
    public static void hello(String name){

        System.out.println("Hello " + name);

    }

}
