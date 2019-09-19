package com.lemon.java.day01;

// package:
// 通过package管理不同的模块
// java程序的单位--》class类
// 用class关键字来声明类（定义类）

// 关键字：java中具有特殊含义的单词，不能用来定义类，变量，方法

// 代码编写：
// 1.代码写在类里面

// 注释的作用：
// 类加注释：
// 单行注释：
// 多行注释：

// 工作区间：保存项目的位置

/** encoding = UTF-8
 * java的第一个HelloWorld程序
 * @author z1520
 */

public class HelloWorld {
    // 类的声明
    // 代码必须写在类中
    public static void main(String [] args ){
        // 定义一个变量a，给一个初始值1
        int a = 1;
        // 定义一个变量b，给一个初始值2
        int b = 2;
//        char hh = '12';
//        System.out.println(hh);
        // 输出语句
        System.out.println(a+b);
    }

}
