package com.leetcode.easy.array;

/**
 * Created with IntelliJ IDEA.
 *
 * description: 买卖股票的最佳时机 II
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/22/
 *
 *
 * https://leetcode-cn.com/submissions/detail/6845815/
 * @author: wanghui<tinyhui.wh_alibaba-inc.com>
 * @date: 2018-08-23 11:25
 */

public class MaxProfit {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) { return 0; }
        int sumProfit = 0;//总收益
        int sellPrice = 0;//卖出价格
        int buyPrice = 0;//买入价格
        boolean isBuy = false;
        for (int i = 0; i < prices.length; i++) {
            if (isBuy) {//已经买入，考虑卖出
                if (i + 1 < prices.length && prices[i + 1] - prices[i] > 0) {
                    continue;
                } else {
                    sellPrice = prices[i];
                    int currentProfit = sellPrice - buyPrice;
                    sumProfit += currentProfit;
                    isBuy = false;
                }
            } else {
                if (i + 1 < prices.length && prices[i + 1] - prices[i] > 0) {
                    buyPrice = prices[i];
                    isBuy = true;
                }
            }
        }
        return sumProfit;
    }

    public static void main(String[] args) throws Exception {
        //int[] sock = {7, 1, 5, 3, 4, 6};
        //int[] sock = {1,2,3,4,5};
        int[] sock = {7, 6, 4, 3, 1};
        MaxProfit maxProfit = new MaxProfit();
        System.out.println(maxProfit.maxProfit(sock));
    }

}
