/*
 * @lc app=leetcode.cn id=42 lang=java
 *
 * [42] 接雨水
 */

// @lc code=start

import java.util.LinkedList;
import java.util.*;

class Solution {    
    public int trap(int[] height) {
        Deque<Integer> indexs = new LinkedList<>();
        int result = 0;
        int n = height.length;
        for(int i = 0; i < n; i++){
            while(!indexs.isEmpty() && height[i] > height[indexs.peekLast()]){
                int mid = indexs.pollLast();
                if(indexs.isEmpty()) break;
                int left = indexs.peekLast();
                result += (Math.min(height[i], height[left]) - height[mid]) * (i - left - 1);
            }
            indexs.addLast(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Solution so = new Solution();
        System.out.println(so.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}
// @lc code=end

