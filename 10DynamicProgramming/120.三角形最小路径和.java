/*
 * @lc app=leetcode.cn id=120 lang=java
 *
 * [120] 三角形最小路径和
 */

// @lc code=start
import java.util.*;
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.size();
        int[] dp = new int[len + 1];
        for(int i = 1 ; i <= len; i++){
            int[] copy = Arrays.copyOf(dp, len + 1);
            for(int j = 1; j <= i; j++){
                if(j == 1){
                    dp[j] = copy[j] + triangle.get(i - 1).get(j - 1);
                }
                else if(j > 1 && j < i){
                    dp[j] = Math.min(copy[j], copy[j - 1]) + triangle.get(i - 1).get(j - 1);
                }
                else if(j == i){
                    dp[j] = copy[j - 1] + triangle.get(i - 1).get(j - 1);
                }
            }
            //System.out.println(Arrays.toString(dp));
        }
        int min = Integer.MAX_VALUE;
        for(int i = 1; i <= len; i++){
            min = Math.min(dp[i], min);
        }
        return min;
    }
}
// @lc code=end

