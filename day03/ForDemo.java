package com.lemon.java.day03;

public class ForDemo {
    public static void main(String[] args) {
//        for(int i = 1;i<=10;i ++){
//            System.out.println(i);
//        }
        //求1--100的和
//        int result1 = 0;
//        for(int i = 0;i<=100;i++){
//            result1 += i;
//        }
//        System.out.println(result1);
//        for (int i = 1; i <=5; i++) {
//            if (i == 3) {
//                continue;  // 跳过本次循环
////                break;  // 跳出循环
//            }
//            // 当为3时跳过本次循环
//            System.out.println(i);
        String result2 = "*";
        for (int i = 1; i <= 5; i++) {
            result2 += "*";
            System.out.println(result2);
        }
    }
}
