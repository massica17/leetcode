/*
 * @lc app=leetcode.cn id=90 lang=java
 *
 * [90] 子集 II
 */

// @lc code=start
import java.util.*;

class Solution {
    List<List<Integer>> res = new ArrayList<>();
    Deque<Integer> path = new LinkedList<>();
    public void backTracking(int[] nums, int start){
        int ls = nums.length;
        if(start > ls) return;
        res.add(new ArrayList<>(path));
        for(int i = start; i < ls; i++){
            if(i > start && nums[i] == nums[i - 1]) continue;
            path.addLast(nums[i]);
            backTracking(nums, i + 1);
            path.pollLast();
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backTracking(nums, 0);
        return res;
    }
}
// @lc code=end

