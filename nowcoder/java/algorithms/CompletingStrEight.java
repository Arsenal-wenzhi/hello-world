package com.companyname.insurance;

/*
* 描述
•连续输入字符串，请按长度为8拆分每个输入字符串并进行输出；
•长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。

输入描述：
连续输入字符串(输入多次,每个字符串长度小于等于100)

输出描述：
依次输出所有分割后的长度为8的新字符串

示例1
输入：
abc
123456789
复制
输出：
abc00000
12345678
90000000
* */


import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static List<String> completingStrEight(String s) {
        List<String> res = new ArrayList<>();
        if (s.length() % 8 != 0) {
            s = s + "00000000";
        }
        while (s.length() >= 8) {
            // substring两个数是范围
            System.out.println(s.substring(0, 8));
            res.add(s.substring(0, 8));
            // 一个数是这个数到末尾
            s = s.substring(8);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in, StandardCharsets.UTF_8.name());
        while (cin.hasNext()) {
            String s = cin.nextLine();
            if (s.length() % 8 != 0) {
                s = s + "00000000";
                System.out.println("s: " + s);
            }
            while (s.length() >= 8) {
                // substring两个数是范围
                System.out.println(s.substring(0, 8));
                // 一个数是这个数到末尾
                s = s.substring(8);
                System.out.println("s2:" + s);
            }

            // System.out.println(completingStrEight(s));
        }
    }

}