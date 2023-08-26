/*
 * @lc app=leetcode.cn id=84 lang=java
 *
 * [84] 柱状图中最大的矩形
 */

// @lc code=start
class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int result = 0;
        int max_height = 0;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(i == j) max_height = heights[i];
                else  if(heights[j] < max_height) max_height = heights[j];
                
                result = Math.max(result, max_height * (j - i + 1));
            }
        }
        return result;
    }
}
// @lc code=end

