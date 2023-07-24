package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Solution239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        int ls = nums.length;
        int[] res = new int[ls - k + 1];
        for(int i = 0; i < ls; i++){
            while(!dq.isEmpty() && dq.getFirst() < i - k + 1){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.getLast()] < nums[i]){
                dq.pollLast();
            }
            dq.addLast(i);
            if(i >= k - 1){
                res[i - k + 1] = nums[dq.getFirst()];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution239 so = new Solution239();
        int[] a = so.maxSlidingWindow(new int[]{1}, 1);
        for(int i = 0; i < a.length; i++){
            System.out.printf("%d ", a[i]);
        }
    }
}
