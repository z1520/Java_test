package com.lemon.java.day03;

public class Operator {
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int c = 3;
//        System.out.println((a>b)&(b>c));  // 短路与运算符
//        // 有且仅当两边都为真，最后结果才为真，当左边为假了，那么后面的表达式就不会执行了
//        System.out.println((a>b)&&(++b>c));
        // 逻辑或：两边都为假才为false，否则为true
        System.out.println((a<b)|(b<c));
        System.out.println((a<b)||(++b>c));
        System.out.println(b);

        // 三目运算符A?B:C--》  A,B,C依次为表达式，而且A是一个条件表达式，经过运算会得到一个boolean类型的值
        // 如果值为true，就执行B表达式，否则就执行C表达式
        System.out.println((a>b?"大于":"小于"));

    }
}
