package com.lemon.java.day02;

public class VariableLearing {
    public static void main(String [] args){
        // 八大基本数据类型
        // 定义布尔类型的变量
        boolean aa = true;
        // 整型
        byte bb = 1;
        short cc = 2;
        int dd = 3;
        long ee = 4;
        // 浮点型
        float ff = 3.14f;  // 小数默认提升到了double类型（八个字节）
        // float，因此大类型转换为小类型，必须强制向下转换。此过程是需要手动完成
        double gg = 3.14;
        // 字符型
        char hh = '1';

        // 引用类型
        String name = "方同学";
        int age = 24;
        System.out.println(name + age);

        //数组
        // 一堆数组
        // 数据类型 []  数组名 = new 数据类型[size]
        int [] arr1 = new int [5];  // int类型默认值为0
        // 场景：创建一个数组，并已知数组的内部元素
        // 语法：类型 [] 数组名 = {...}
        String [] names = {"张三","李四","王五"};
        // 60,70,80,90,100
        arr1[0] = 60;
        arr1[1] = 70;
        arr1[2] = 80;
        arr1[3] = 90;
        arr1[4] = 100;


    }
}
