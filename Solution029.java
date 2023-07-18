public class Solution029 {
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
    public static void main(String[] args) {
        Solution029 so = new Solution029();
        int[] nums = new int[]{1,1,1,1,1,1,1,1,1};
        int target = 11;
        int res = so.minSubArrayLen(target, nums);
        System.out.println(res);
    }
}
