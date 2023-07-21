package HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++){
            if(m.containsKey(nums1[i])){
                m.put(nums1[i], m.get(nums1[i]) + 1);
            }
            else{
                m.put(nums1[i], 1);
            }
        }
        int count = 0;
        for(int i = 0; i < nums2.length; i++){
            if(m.containsKey(nums2[i])){
                count = m.get(nums2[i]);
                if(count > 0){
                    count = count - 1;
                    m.put(nums2[i], count);
                    res.add(nums2[i]);
                }
            }
        }
        return res.stream().mapToInt(x -> x).toArray();
    }
}
