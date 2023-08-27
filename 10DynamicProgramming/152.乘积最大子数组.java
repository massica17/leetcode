/*
 * @lc app=leetcode.cn id=152 lang=java
 *
 * [152] 乘积最大子数组
 */

// @lc code=start


class Solution{
    public int maxProduct(int[] nums){
        int left = 0;
        int right = 0;
        boolean has_zero = false;
        int len = nums.length;
        int[] dp = new int[len];
        int max = Integer.MIN_VALUE;
        while(left < len){
            if(nums[left] != 0){
                right = left;
                while(right < len && nums[right] != 0){
                    right++;
                }
                dp[left] = nums[left];
                max = Math.max(max, dp[left]);
                for(int i = left + 1; i < right; i++){
                    dp[i] = dp[i - 1] * nums[i];
                    max = Math.max(dp[i], max);
                }
                for(int i = left + 1; i < right; i++){
                    for(int j = i; j < right; j++){
                        dp[j] = dp[j] / nums[i - 1];
                        max = Math.max(max, dp[j]);
                    }
                }
                left = right;
            }
            else {
                has_zero = true;
                left++;
            }
        }
        if(has_zero) return Math.max(max, 0);
        else return max;
    }
}
// @lc code=end

