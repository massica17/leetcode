/*
 * @lc app=leetcode.cn id=739 lang=java
 *
 * [739] 每日温度
 */

// @lc code=start

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        if(n <= 1) return res;
        List<Integer> inds = new ArrayList<>();
        int cur = 0;
        for(int i = 0; i < n; i++){
            cur = i;
            // for(int j = 0; j < inds.size(); j++){
            //     System.out.printf("%d ", temperatures[inds.get(j)]);
            // }
            // System.out.println();
            while(inds.size() >= 1 && temperatures[i] > temperatures[inds.get(inds.size() - 1)]){
                res[inds.get(inds.size() - 1)] = cur - inds.get(inds.size() - 1);
                inds.remove(inds.size() - 1);
            }
            inds.add(i);
            //System.out.println(Arrays.toString(res));
        }
        return res;
    }
}
// @lc code=end

