public class Solution034 {
    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        int le = 0, ri = len - 1;
        int mid = 0;
        boolean find = false;
        while(le <= ri){
            mid = le + (ri - le) / 2;
            if(nums[mid] == target){
                find = true;
                break;
            }
            if(nums[mid] > target){
                ri = mid - 1;
            }
            else{
                le = mid + 1;
            }
        }
        if(!find){
            return new int[]{-1, -1};
        }
        le = mid;
        ri = mid;
        for(int i = mid; i >=0 ; i--){
            if(nums[mid] == nums[i]){
                le = i;
            }
            else {
                break;
            }
        }
        for(int i = mid; i < len; i++){
            if(nums[mid] == nums[i]){
                ri = i;
            }
            else{
                break;
            }
        }
        return new int[]{le, ri};
    }
}
