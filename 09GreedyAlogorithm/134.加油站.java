/*
 * @lc app=leetcode.cn id=134 lang=java
 *
 * [134] 加油站
 */

// @lc code=start
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int ls = gas.length;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int min_ind = 0;
        for(int i = 0; i < ls; i++){
            sum += gas[i] - cost[i];
            if(sum <= min){
                min = sum;
                min_ind = i;
            }
        }
        return sum >= 0 ? (min_ind + 1) % ls : -1; 
    }
}
// @lc code=end

