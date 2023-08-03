/*
 * @lc app=leetcode.cn id=45 lang=java
 *
 * [45] 跳跃游戏 II
 */

// @lc code=start
class Solution {
    public int jump(int[] nums) {
        int ls = nums.length;
        if(ls <= 1) return 0;
        int count = 1;
        int pre_max = 0;
        int pre_temp = pre_max;
        int cur_max = nums[0];
        int cur_temp = cur_max;
        if(cur_max >= ls - 1) return count; 
        while(pre_max != cur_max){
            count ++;
            pre_temp = pre_max;
            cur_temp = cur_max;
            pre_max = cur_max;
            for(int i = pre_temp; i <= cur_temp; i++){
                if(nums[i] + i > cur_max) {
                    cur_max = nums[i] + i;
                    if(cur_max >= ls - 1) return count;
                }
            }
        }
        return count;
    }
}
// @lc code=end

