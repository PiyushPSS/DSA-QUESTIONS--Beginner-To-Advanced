/*
 * @lc app=leetcode id=1342 lang=java
 *
 * [1342] Number of Steps to Reduce a Number to Zero
 */

// @lc code=start
class Solution {
    public int numberOfSteps(int num) {

        int count = 0;

        while(num > 0) {
            if(num % 2 != 0) {
                num = num - 1;
                count++;
            } else {
                count++;
                num /= 2;
            }
        }
        return count;
    }
}
// @lc code=end

