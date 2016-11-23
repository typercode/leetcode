package com.leetcode.easy;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Description: https://leetcode.com/problems/single-number/
 * <p>
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * <p>
 * Note:
 * <p>
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * <p>
 * Author: wanghui<tinyhui.wang@gmail.com>
 * Created on: 2016-11-23 16:41
 */

public class SingleNumber {

    public int solution(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            int j = 0;
            for (; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    break;
                }
            }
            if (j == nums.length) {
                return nums[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        SingleNumber sn = new SingleNumber();
        int[] num = {1, 1, 2, 2, 3, 3, 4, 12, 4, 5, 5};
        // int[] num = {5};
        System.out.println(sn.solution(num));
    }
}
