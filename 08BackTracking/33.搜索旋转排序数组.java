/*
 * @lc app=leetcode.cn id=33 lang=java
 *
 * [33] 搜索旋转排序数组
 */

// @lc code=start
class Solution {
    public int binarySearch(int[] nums, int left, int right, int target){
        int mid = (left + right) / 2;
        while(left <= right){
            mid = (left + right) / 2;
            if(target == nums[mid]) return mid;
            if(target > nums[mid]) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        int m = (l + r) / 2;
        if(nums[l] < nums[r]){
            return binarySearch(nums, l, r, target);
        }
        while(l < r - 1){
            //System.out.printf("%d %d %d %n", l, m, r);
            m = (l + r) / 2;
            if(nums[l] < nums[m]){
                l = m;
            }
            else{
                r = m;
            }
        }
        if(target < nums[r] || target > nums[l]) return -1;
        if(target > nums[n - 1]) return binarySearch(nums, 0, l, target);
        else return binarySearch(nums, r, n - 1, target);
    }
    public static void main(String[] args) {
        Solution so = new Solution();
        System.out.println(so.search(new int[]{2, 3, 4, 0}, 4));
    }
}
// @lc code=end

