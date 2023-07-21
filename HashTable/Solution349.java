package HashTable;

import java.util.HashSet;
import java.util.Set;

public class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> ns = new HashSet<>();
        Set<Integer> rs = new HashSet<>();
        int l1 = nums1.length;
        int l2 = nums2.length;
        for(int i = 0; i < l1; i++){
            ns.add(nums1[i]);
        }
        for(int i = 0; i < l2; i++){
            if(ns.contains(nums2[i])){
                rs.add(nums2[i]);
            }
        }
        return rs.stream().mapToInt(x -> x).toArray();
    }
}
