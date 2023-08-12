/*
 * @lc app=leetcode.cn id=77 lang=java
 *
 * [77] 组合
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.LinkedList;

class Solution {
    List<List<Integer>> result= new ArrayList<>();
    Deque<Integer> path = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtracking(n,k,1);
        return result;
    }

    public void backtracking(int n, int k, int start){
        if(path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i = start; i <= n - (k - path.size()) + 1; i++){
            path.addLast(i);
            backtracking(n, k, i + 1);
            path.removeLast();
        }
    }
}
// @lc code=end

