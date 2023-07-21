package HashTable;
import java.util.Map;
import java.util.HashMap;
public class Solution001 {
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
