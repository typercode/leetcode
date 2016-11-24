package com.leetcode.easy;

/**
 * Created with IntelliJ IDEA.
 * <p>
 * Description: https://leetcode.com/problems/assign-cookies/
 * <p>
 * Assume you are an awesome parent and want to give your children some cookies. But, you should give
 * <p>
 * each child at most one cookie. Each child i has a greed factor gi, which is the minimum size of a cookie that
 * <p>
 * the child will be content with; and each cookie j has a size sj. If sj >= gi, we can assign the cookie j to the
 * <p>
 * child i, and the child i will be content. Your goal is to maximize the number of your content children and
 * <p>
 * output the maximum number.
 * <p>
 * Note:
 * <p>
 * You may assume the greed factor is always positive.
 * <p>
 * You cannot assign more than one cookie to one child.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3], [1,1]
 * <p>
 * Output: 1
 * <p>
 * Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3.
 * <p>
 * And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
 * <p>
 * You need to output 1.
 * <p>
 * Example 2:
 * <p>
 * Input: [1,2], [1,2,3]
 * <p>
 * Output: 2
 * <p>
 * Explanation: You have 2 children and 3 cookies. The greed factors of 2 children are 1, 2.
 * <p>
 * You have 3 cookies and their sizes are big enough to gratify all of the children,
 * <p>
 * You need to output 2.
 * <p>
 * Author: wanghui<tinyhui.wang@gmail.com>
 * Created on: 2016-11-24 09:55
 */

public class AssignCookies {

    /**
     * assume g and s are <b>ordered</b>.
     *
     * @param g
     * @param s
     * @return
     */
    public int solution(int[] g, int[] s) {
        int num = 0;
        for (int i = g.length - 1; i >= 0; i--) {
            for (int j = s.length - 1; j >= 0; j--) {
                if (g[i] <= s[j]) {
                    num++;
                    break;
                }
            }
        }
        return num;
    }


    /**
     * assume g and s are <b>unordered</b>.
     *
     * @param g
     * @param s
     * @return
     */
    public int solution2(int[] g, int[] s) {
        int num = 0;
        //TODO implements
        return num;
    }

    public static void main(String[] args) {
        AssignCookies ac = new AssignCookies();
        int[] g = {1, 2, 3};
        int[] s = {1, 1};
        System.out.println(ac.solution(g, s));
    }
}
