package StackAndQueue;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution347 {
    public int[] topKFrequent(int[] nums, int k) {
        int ls = nums.length;
        Queue<Map.Entry<Integer, Integer>> res = new PriorityQueue<>((a, b) -> b.getValue().compareTo(a.getValue()));
        
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for(int i = 0; i < ls; i++){
            m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
        }
        int count = 0;
        Iterator<Map.Entry<Integer, Integer>> iterator = m.entrySet().iterator();
        while(iterator.hasNext()){
            res.add(iterator.next());
        }
        int[] res_n = new int[k];
        while(count < k){
            res_n[count++] = res.poll().getKey(); 
        }
        return res_n;
    }
    public static void main(String[] args) {
        Solution347 so = new Solution347();
        int[] res = so.topKFrequent(new int[]{1}, 1);
        for(int i = 0; i < res.length; i++){
            System.out.println(res[i]);
        }
    }
}
