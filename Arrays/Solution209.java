package Arrays;
public class Solution209 {
    public int minSubArrayLen(int target, int[] nums) {
        int temp = 0;
        int len = nums.length;
        int s = 0, f = 0;
        int min = len;
        boolean find = false;
        while(f < len){
            temp += nums[f];
            if(s == f){
                temp = nums[f];
            }
            if(temp >= target){
                find = true;
                while(temp >= target){
                    if(s == f){
                        temp = nums[f];
                    }
                    if(min > f - s + 1){
                        min = f - s + 1;
                    }
                    temp -= nums[s];
                    s++;
                }
            }
            f++;
        }
        return find ? min : 0;
    }
}
