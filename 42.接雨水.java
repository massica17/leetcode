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
        int slow = 0;
        int fast = 0;
        int res = 0;
        while(slow + 1 < n && height[slow + 1] >= height[slow]) slow ++;
        if(slow == n - 1) return 0;
        while(true){
            int find_min = slow;
            while(find_min + 1 < n && height[find_min + 1] <= height[find_min]) find_min++;
            if(find_min >= n) return res;
            fast = find_min + 1;
            while(fast + 1 < n && height[fast + 1] >= height[fast]) fast++;
            if(fast >= n) return res;
            int temp = Math.min(height[slow], height[fast]);
            for(int i = slow; i <= fast; i++){
                res += Math.max(temp - height[i], 0);
            }
            System.out.printf("slow:%d find_min:%d fast:%d%n", slow, find_min, fast);
            slow = fast;
            if(slow == n - 1) return res;
        }
        
    }
    public static void main(String[] args) {
        Solution so = new Solution();
        System.out.println(so.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}
// @lc code=end

