package com.leetcode.easy;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Write a function that takes a string as input and returns the string reversed.
 * <p>
 * Example:
 * <p>
 * Given s = "hello", return "olleh".
 * <p>
 * Description: reverse string
 * Author: wanghui<tinyhui.wang@gmail.com>
 * Created on: 2016-11-21 18:06
 */

public class ReverseString {

    public String solution(String s) {
        if (s == null) {
            return null;
        }
        StringBuilder buff = new StringBuilder(s.length());
        char[] c = s.toCharArray();
        for (int i = c.length - 1; i >= 0; i--) {
            buff.append(c[i]);
        }
        return buff.toString();
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        System.out.println(rs.solution("hello"));
    }
}
