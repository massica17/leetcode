/*
 * @lc app=leetcode.cn id=78 lang=java
 *
 * [78] 子集
 */

// @lc code=start
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Deque;

class Solution {
    List<List<Integer>> res = new ArrayList<>();
    Deque<Integer> path = new LinkedList<>();
    public void backTracking(int[] nums, int start){
        int ls = nums.length;
        if(start > ls) return;
        res.add(new ArrayList<>(path));
        for(int i = start; i < ls; i++){
            path.addLast(nums[i]);
            backTracking(nums, i + 1);
            path.pollLast();
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        backTracking(nums, 0);   
        return res;     
    }
}
// @lc code=end

