/*
 * @lc app=leetcode.cn id=368 lang=java
 *
 * [368] 最大整除子集
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] dp = new int[n];
        dp[0] = 1;
        int[] index = new int[n];
        index[0] = -1;
        int res_max = 0;
        int res_ind = 0;
        for(int i = 1; i < n; i++){
            boolean if_new = true;
            int max = 0;
            int pre_ind = 0;
            for(int j = 0; j < i; j++){
                if(nums[i] % nums[j] == 0){
                    if(max < dp[j] + 1){
                        max = dp[j] + 1;
                        pre_ind = j;
                        if_new = false;
                    }
                }
            }
            if(if_new){
                dp[i] = 1;
                index[i] = -1;
            }
            else{
                dp[i] = max;
                index[i] = pre_ind;
            }
            // System.out.println(Arrays.toString(dp));
            // System.out.println(Arrays.toString(index));
            // System.out.println();
        }
        for(int i = 0; i < n; i++){
            if(res_max < dp[i]){
                res_max = dp[i];
                res_ind = i;
            }
        }
        List<Integer> res = new ArrayList<>();
        res.add(nums[res_ind]);
        while(index[res_ind] != -1){
            res.add(nums[index[res_ind]]);
            res_ind = index[res_ind];
        }
        return res;
    }
}
// @lc code=end

