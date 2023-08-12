/*
 * @lc app=leetcode.cn id=376 lang=java
 *
 * [376] 摆动序列
 */

// @lc code=start
class Solution {
    public int wiggleMaxLength(int[] nums) {
        int ls = nums.length;
        if(ls <= 0) return ls;
        int curDiff = 0;
        int preDiff = 0;
        int result = 1;
        for(int i = 0; i < ls - 1; i++){
            curDiff = nums[i + 1] - nums[i];
            if(preDiff <= 0 && curDiff > 0 || preDiff >= 0 && curDiff < 0){
                result++;
                preDiff = curDiff;
            }
        }
        return result;
    }
}
// @lc code=end

