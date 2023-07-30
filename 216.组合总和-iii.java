/*
 * @lc app=leetcode.cn id=216 lang=java
 *
 * [216] 组合总和 III
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Solution {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    Deque<Integer> path = new LinkedList<>();
    public void backtracking(int n, int k, int start, int val){
        if(val > n) return;
        if(val == n && path.size() == k){
            res.add(new ArrayList<>(path));
        }
        for(int i = start; i <= 9; i++){
            path.addLast(i);
            backtracking(n, k, i + 1, val + i);
            path.removeLast();
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtracking(n, k, 1, 0);
        return res;
    }
}
// @lc code=end

