package com.leetcode.easy;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Description: https://leetcode.com/problems/two-sum/
 * <p>
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9
 * <p>
 * return [0, 1].
 * <p>
 * UPDATE (2016/2/13):
 * <p>
 * The return format had been changed to zero-based indices. Please read the above updated description carefully.
 * <p>
 * Author: wanghui<tinyhui.wang@gmail.com>
 * Created on: 2016-11-24 14:27
 */

public class TwoSum {

    public int[] solution(int[] nums, int target) {
        int[] indices = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        //Expected:[3,4]
        int[] info = {2, 1, 9, 4, 4, 56, 90, 3};
        int[] indices = ts.solution(info, 8);
        for (int indice : indices) {
            System.out.println(indice);
        }
    }

}
