/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();   
        int n_size = nums.length;
        for(int i = 0; i < n_size; i++){
            if(m.containsKey(target - nums[i])){
                return new int[]{i , m.get(target - nums[i])};
            }
            else {
                m.put(nums[i], i);
            }
        }
        return null;
    }
}
// @lc code=end

