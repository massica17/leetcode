import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution015 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int len = nums.length;
        int sum = 0;
        for(int i = 0 ; i < len - 2; i++){
            if(nums[i] > 0){
                break;
            }
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int le = i + 1;
            int ri = len - 1;
            while(le < ri){
                sum = nums[i] + nums[le] + nums[ri];
                if(sum == 0){
                    List<Integer> u = new ArrayList<Integer>();
                    u.add(nums[i]);
                    u.add(nums[le]);
                    u.add(nums[ri]);
                    res.add(u);
                    while(le < ri && nums[le] == nums[le + 1]){
                        le ++;
                    }
                    while(ri > le && nums[ri] == nums[ri - 1]){
                        ri --;
                    }
                }
                if(sum < 0){
                    le++;
                }
                if(sum >= 0){
                    ri--;
                }
            }
        }
        
        return res;
    }
    public static void main(String[] args) {
        Solution015 s = new Solution015();
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> res = s.threeSum(nums);
        System.out.println(res);
    }
}
