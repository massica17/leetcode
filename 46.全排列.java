/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class Solution {
    private List<List<Integer>> res = new ArrayList<>();
    private Deque<Integer> path = new LinkedList<>();
    private int[] use = new int[10];
    public void backTracking(int[] nums, int cur){
        int ls = nums.length;
        if(path.size() == ls){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = 0; i < ls; i++){
            if(use[i] == 0){
                path.add(nums[i]);
                use[i] = 1;
                backTracking(nums, cur);
                use[i] = 0;
                path.removeLast();
            }
            else continue;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        backTracking(nums, 0);
        return res;
    }
}
// @lc code=end

