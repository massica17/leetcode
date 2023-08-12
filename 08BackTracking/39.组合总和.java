/*
 * @lc app=leetcode.cn id=39 lang=java
 *
 * [39] 组合总和
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Solution {
    List<List<Integer>> res = new ArrayList<>();
    Deque<Integer> path = new LinkedList<>();
    private void backtracking(int[] candidates, int target, int start, int val){
        if(val > target) return;
        if(val == target){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = start; i < candidates.length ; i++){
            if(val + candidates[i] > target) continue;
            path.addLast(candidates[i]);
            backtracking(candidates, target, i, val + candidates[i]);
            path.removeLast();
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtracking(candidates, target, 0, 0);
        return res;
    }
}
// @lc code=end

