package com.leetcode.easy;


/**
 * Created with IntelliJ IDEA.
 * <p>
 * Description: https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * <p>
 * Given a binary tree, find its maximum depth.
 * <p>
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest
 * <p>
 * leaf node.
 * <p>
 * Author: wanghui<tinyhui.wang@gmail.com>
 * <p>
 * Created on: 2016-11-24 14:52
 */

public class MaximumDepthOfBinaryTree {

    public int solution(TreeNode root) {
        int depth = 0;
        if (root == null) return 0;
        if (root.left == null) {
            return ++depth;
        }
        return depth;
    }


    public static void main(String[] args) {
        MaximumDepthOfBinaryTree mdobt = new MaximumDepthOfBinaryTree();
        TreeNode tn = new TreeNode(1);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mdobt.solution(tn);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}