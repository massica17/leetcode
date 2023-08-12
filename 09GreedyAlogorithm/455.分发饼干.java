/*
 * @lc app=leetcode.cn id=455 lang=java
 *
 * [455] 分发饼干
 */

// @lc code=start
import java.util.*;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gi = g.length - 1;
        int si = s.length - 1;
        int count = 0;
        while(gi >= 0 && si >= 0){
            if(s[si] >= g[gi]){
                count++;
                gi--;
                si--;
            }
            else{
                gi--;
            }
        }
        return count;
    }
}
// @lc code=end

