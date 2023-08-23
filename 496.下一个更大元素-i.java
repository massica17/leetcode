/*
 * @lc app=leetcode.cn id=496 lang=java
 *
 * [496] 下一个更大元素 I
 */

// @lc code=start
import java.util.*;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] res = new int[n1];
        Arrays.fill(res, -1);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n1; i++) map.put(nums1[i], i);

        Deque<Integer> inds = new LinkedList<>();
        inds.addLast(0);
        for(int i = 1; i < n2; i++){
            if(nums2[i] <= nums2[inds.peekLast()]){
                inds.addLast(i);
            }
            else{
                while(!inds.isEmpty() && nums2[inds.peekLast()] < nums2[i]){
                    if(map.containsKey(nums2[inds.peekLast()])){
                        Integer ind = map.get(nums2[inds.peekLast()]);
                        res[ind] = nums2[i];
                    }
                    inds.pollLast();
                }
                inds.add(i);
            }
        }
        return res;
    }
}
// @lc code=end

