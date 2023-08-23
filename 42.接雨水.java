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
        int n = height.length;
        int res = 0;
        if(n < 2) return 0;
        Deque<Integer> inds = new LinkedList<>();
        int ind = 0;
        while(ind < n && height[ind + 1] > height[ind]) ind++; //找到第一个下降点
        inds.add(ind);
        int cur = 0;
        for(int i = ind + 1; i < n; i++){
            cur = i;
            if(height[i] < height[inds.peekLast()]){
                inds.addLast(i);
            }
            else {
                int now_ind = 0;
                while(!inds.isEmpty() && height[i] > height[inds.peekLast()]){
                    now_ind = inds.peekLast();
                    
                }
            }
        }
    }
}
// @lc code=end

