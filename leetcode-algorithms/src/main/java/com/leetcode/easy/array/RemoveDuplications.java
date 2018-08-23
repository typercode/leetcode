package com.leetcode.easy.array;

/**
 * Created with IntelliJ IDEA.
 *
 * description: 从排序数组中删除重复项
 *
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/21/
 *
 * @author: wanghui<tinyhui.wh_alibaba-inc.com>
 * @date: 2018-08-23 11:01
 */

public final class RemoveDuplications {

    private RemoveDuplications() {}

    public static int removeDuplications(int[] nums) {
        if (nums == null || nums.length == 0) {return 0;}
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }

    public static void main(String[] args) throws Exception {
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 5, 6, 7, 8, 9};
        int len = removeDuplications(nums);
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }

}
