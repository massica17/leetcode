/*
 * @lc app=leetcode.cn id=491 lang=java
 *
 * [491] 递增子序列
 */

// @lc code=start
import java.util.*;

class Solution {
    Deque<Integer> path = new LinkedList<>();
    List<List<Integer>> res = new ArrayList<>();
    public void backTracking(int[] nums, int start){
        int ls = nums.length;
        if(path.size() >= 2){
            res.add(new ArrayList<>(path));
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int i = start ; i < ls; i++){
            if(!path.isEmpty() && path.peekLast() > nums[i] || hs.contains(nums[i])) 
                continue;
            path.add(nums[i]);
            hs.add(nums[i]);
            backTracking(nums, i + 1);
            path.pollLast();
        }
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        int ls = nums.length;
        if(ls <= 1) return res;
        backTracking(nums, 0);
        return res;
    }
}
// @lc code=end

