package HashTable;

import java.util.HashMap;

public class Solution454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int temp = 0;
        int res = 0;
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                temp = nums1[i] + nums2[j];
                m.put(temp, m.getOrDefault(temp ,0) + 1);
            }
        }
        for(int i = 0; i < nums3.length; i++){
            for(int j = 0; j < nums4.length; j++){
                temp = 0 - (nums3[i] + nums4[j]);
                res += m.getOrDefault(temp, 0);
            }
        }
        return res;
    }
}
