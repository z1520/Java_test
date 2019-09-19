package com.lemon.java.day03;
/*
*  根据月份获取季节
* */
public class SwithDemo {
    public static void main(String[] args){
        int month = 7;
        switch (month) {
            case 1:
                System.out.println("春季");
                break;
            case 2:
                System.out.println("春季");
                break;
            case 3:
                System.out.println("春季");
                break;
            case 4:
                System.out.println("夏季");
                break;
            case 5:
                System.out.println("夏季");
                break;
            case 6:
                System.out.println("夏季");
                break;
            case 7:
                System.out.println("秋季");
                break;
            case 8:
                System.out.println("秋季");
                break;
            case 9:
                System.out.println("秋季");
                break;
            case 10:
                System.out.println("冬季");
                break;
            case 11:
                System.out.println("冬季");
                break;
            case 12:
                System.out.println("冬季");
                break;

                default:
                    System.out.println("请检查输入内容");
                    break;
        }
    }
}
