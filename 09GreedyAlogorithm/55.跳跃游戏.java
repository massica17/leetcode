/*
 * @lc app=leetcode.cn id=55 lang=java
 *
 * [55] 跳跃游戏
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        boolean result = true;
        int ls = nums.length;
        if(ls <= 1) return result;
        int pre_max = 0;
        int pre_temp = pre_max;
        int cur_max = nums[0];
        int cur_temp = cur_max;
        if(cur_max >= ls - 1) return true; 
        while(pre_max != cur_max){
            pre_temp = pre_max;
            cur_temp = cur_max;
            pre_max = cur_max;
            for(int i = pre_temp; i <= cur_temp; i++){
                if(nums[i] + i > cur_max) {
                    cur_max = nums[i] + i;
                    if(cur_max >= ls - 1) return true;
                }
            }
            if(pre_max == cur_max && pre_max < ls - 1) return false;
        }
        return false;
    }
}
// @lc code=end

