/*
 * @lc app=leetcode id=1518 lang=java
 *
 * [1518] Water Bottles
 */

// @lc code=start
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int result = numBottles;
        int rem = 0;

        while (numBottles >= numExchange) {
            rem = (numBottles % numExchange);
            numBottles = numBottles / numExchange;
            result += numBottles;
            numBottles += rem;
        }

        return result;
    }
}
// @lc code=end
