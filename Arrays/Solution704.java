package Arrays;
public class Solution704 {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int le = 0, ri = len - 1;
        int mid = 0;
        while(le <= ri){
            mid = le + (ri - le) / 2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                ri = mid - 1;
            }
            else {
                le = mid + 1;
            }
        }   
        return -1;
    }
}
