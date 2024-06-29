/*
 * @lc app=leetcode id=989 lang=java
 *
 * [989] Add to Array-Form of Integer
 */

// @lc code=start

import java.util.List;
import java.util.ArrayList;

class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {9,9,3};
        int k = 7;

        System.out.println(s.addToArrayForm(arr, k));
    }

    public List<Integer> addToArrayForm(int[] num, int k) {

        // Approach 1: (Bounds Exceeding for 99999999999)

        // List<Integer> result = new ArrayList<>();

        // int power = 0;
        // int number = 0;

        // for(int i = num.length - 1 ; i >= 0 ; i--) {
        // number += num[i] * Math.pow(10, power);
        // power++;
        // }

        // number += k;
        // while(number > 0) {
        // int rev = number % 10;
        // result.addFirst(rev);
        // number /= 10;
        // }
        // return result;

        // ________________________________

        // Approach 2: (WORKING PROPERLY)

        // List<Integer> result = new ArrayList<>();

        // int carry = 0;
        // int i = num.length - 1;

        // while (i >= 0 || k > 0 || carry > 0) {
        // int sum = carry;

        // if (i >= 0) {
        // sum += num[i];
        // i--;
        // }

        // if (k > 0) {
        // sum += k % 10;
        // k /= 10;
        // }

        // result.add(0, sum % 10);
        // carry = sum / 10;
        // }

        // return result;

        // ________________________________________

        // Approach 3: (WORKING PROPERLY)

        List<Integer> result = new ArrayList<>();

        int p = num.length - 1;
        int carry = 0;
        int sum = 0;

        while (p >= 0) {
            int pointerValue = num[p];
            int rev = k % 10;

            sum = pointerValue + rev + carry;

            carry = sum / 10;
            result.add(0, sum % 10);

            p--;

            k /= 10;

            if (k <= 0) {
                break;
            }
        }

        if (k > 0) {
            while (k > 0) {
                int temp = k % 10;
                temp += carry;
                carry = temp / 10;
                result.add(0, temp % 10);
                k /= 10;
            }
        } else {
            while (p >= 0) {
                int temp = num[p--];
                temp = temp + carry;

                carry = temp / 10;
                result.add(0, temp % 10);
            }
        }
        if(carry != 0) {
            result.add(0, carry);
        }

        return result;
    }
}
// @lc code=end
