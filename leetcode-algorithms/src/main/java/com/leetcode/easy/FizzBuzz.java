package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Description:
 * <p>
 * Write a program that outputs the string representation of numbers from 1 to n.
 * But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”.
 * For numbers which are multiples of both three and five output “FizzBuzz”.
 * <p>
 * Example:
 * <p>
 * n = 15,
 * <p>
 * Return:
 * [
 * "1",
 * "2",
 * "Fizz",
 * "4",
 * "Buzz",
 * "Fizz",
 * "7",
 * "8",
 * "Fizz",
 * "Buzz",
 * "11",
 * "Fizz",
 * "13",
 * "14",
 * "FizzBuzz"
 * ]
 * <p>
 * Author: wanghui<tinyhui.wang@gmail.com>
 * Created on: 2016-11-18 20:32
 */

public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> msg = new ArrayList<String>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                msg.add("" + i);
            } else if (i % 3 == 0 && i % 5 != 0) {
                msg.add("Fizz");
            } else if (i % 5 == 0 && i % 3 != 0) {
                msg.add("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                msg.add("FizzBuzz");
            }
        }
        return msg;
    }

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        System.out.println(fb.fizzBuzz(15));
//        System.out.println(fb.fizzBuzz(Integer.valueOf(args[0])));
    }

}
