/*
 * @lc app=leetcode.cn id=718 lang=java
 *
 * [718] 最长重复子数组
 */

// @lc code=start
class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int max = 0;
        int[][] dp = new int[n1][n2];
        for(int i  = 0; i < n1; i++){
            if(nums1[i] == nums2[0]) dp[i][0] = 1;
            max = Math.max(max, dp[i][0]);
        }
        for(int i  = 0; i < n2; i++){
            if(nums2[i] == nums1[0]) dp[0][i] = 1;
            max = Math.max(max, dp[0][i]);
        }

        for(int i = 1; i < n1; i++){
            for(int j = 1; j < n2; j++){
                if(nums1[i] == nums2[j]){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        return max;
    }
}
// @lc code=end

