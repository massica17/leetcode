package Arrays;
public class Solution026 {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len <= 1){
            return len;
        }
        int count = 0;
        for(int i = 1; i < len; i++){
            if(nums[i] != nums[count]){
                count++;
                nums[count] = nums[i];
            }
        }
        return count + 1;
    }
}
