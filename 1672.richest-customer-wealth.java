/*
 * @lc app=leetcode id=1672 lang=java
 *
 * [1672] Richest Customer Wealth
 */

// @lc code=start
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i = 0 ; i < accounts.length ; i++) {
            int tempSum = 0;
            for(int j = 0 ; j < accounts[i].length ; j++) {
                tempSum += accounts[i][j];
            }

            if(tempSum > max) {
                max = tempSum;
            }
        }

        return max;
    }
}
// @lc code=end

