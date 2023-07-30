/*
 * @lc app=leetcode.cn id=581 lang=java
 *
 * [581] 最短无序连续子数组
 */

// @lc code=start
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int ls = nums.length;
        if(ls <= 1) return 0;
        int left = 0;
        int right = ls - 1;
        while(left < ls - 1 && nums[left] <= nums[left + 1]){
            left ++;
        }
        if(left == ls - 1) return 0;
        while(right >= 1 && nums[right] >= nums[right - 1]){
            right--;
        }
        System.out.printf("%d %d %n", left, right);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = left; i <= right; i++){
            if(min > nums[i]) min = nums[i];
            if(max < nums[i]) max = nums[i];
        }
        for(int i = 0; i <= left; i++){
            if(min < nums[i]){
                left = i;
                break;
            }
        }
        for(int i = ls - 1; i >= right; i--){
            if(max > nums[i]){
                right = i;
                break;
            }
        }
        System.out.printf("%d %d %n", left, right);
        return right - left + 1;
    }
    public static void main(String[] args) {
        Solution so = new Solution();
        int res = so.findUnsortedSubarray(new int[]{1,3,2,2,2});
        System.out.println(res);
    }
}
// @lc code=end

