import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution018 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int len = nums.length;
        if(len < 4){
            return res;
        }
        int l = 0, r = len-1, i = 0, j = 0;
        long temp = 0;
        
        for(i = 0 ; i < len - 3; i++){
            for(j = i + 1; j < len - 2; j++){
                l = j + 1;
                r = len - 1;
                while(l < r){
                    temp = (long)nums[i] + nums[j] + nums[l] + nums[r];
                    if(temp == target){
                        List<Integer> u_res = new ArrayList<Integer>();
                        u_res.add(nums[i]);
                        u_res.add(nums[j]);
                        u_res.add(nums[l]);
                        u_res.add(nums[r]);
                        res.add(u_res);
                    }
                    if(temp > target){
                        r--;
                    }else{
                        l++;
                    }
                }
            }
        }
        List<List<Integer>> res2= new ArrayList<List<Integer>>();
        boolean flag = false;
        for(int k = 0 ; k < res.size(); k++){
            flag = false;
            for(int m = 0; m < res2.size(); m++){
                if(
                    res.get(k).get(0).equals(res2.get(m).get(0)) &&
                    res.get(k).get(1).equals(res2.get(m).get(1)) &&
                    res.get(k).get(2).equals(res2.get(m).get(2)) &&
                    res.get(k).get(3).equals(res2.get(m).get(3)) 
                   
                )
                {
                    flag = true;
                }
            }
            if(!flag){
                res2.add(res.get(k));
            }
        }
        return res2;
    }
    public static void main(String[] args) {
        
    }
}
