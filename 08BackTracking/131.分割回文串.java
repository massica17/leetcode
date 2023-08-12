/*
 * @lc app=leetcode.cn id=131 lang=java
 *
 * [131] 分割回文串
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public boolean isVaild(String s, int start, int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
    List<List<String>> res = new ArrayList<>();
    Deque<String> path = new LinkedList<>();
    public void backTracking(String s, int start){
        if(start >= s.length()){
            res.add(new ArrayList<>(path));
        }
        for(int i = start; i < s.length(); i++){
            if(isVaild(s, start, i)){
                path.add(s.substring(start, i + 1));
            }
            else continue;
            backTracking(s, i + 1);
            path.removeLast();
        }
    }
    public List<List<String>> partition(String s) {
        backTracking(s, 0);
        return res;
    }
}
// @lc code=end

