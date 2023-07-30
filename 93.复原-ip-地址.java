/*
 * @lc app=leetcode.cn id=93 lang=java
 *
 * [93] 复原 IP 地址
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Solution {
    List<String> res = new LinkedList<>();
    Deque<Integer> path = new LinkedList<>();
    List<Integer> num = new ArrayList<>();
    public int getNum(char[] sc, int start, int end){
        if(sc[start] == '0' && end != start) return -1;
        int sum = 0;
        for(int i = start; i <= end; i++){
            sum *= 10;
            sum += sc[i] - '0';
        }
        return sum;
    }
    public void backTracking(char[] sc, int start){
        if(path.size() == 3){
            int last = getNum(sc, path.peekLast() + 1, sc.length - 1);
            if(last <= 255 && last >= 0){
                String s = "" + num.get(0) + "." + num.get(1) +  "." + num.get(2) + "." + last;
                res.add(s);
            }
            return;
        }
        if(path.size() > 3) return;

        for(int i = start; i < sc.length - 1; i++){
            int cur = getNum(sc, start, i);
            //System.out.printf("%d %d %d %n", start, i, cur);
            if(cur >= 0 && cur <= 255){
                num.add(cur);
                path.addLast(i);
                backTracking(sc, i + 1);
                path.removeLast();
                num.remove(num.size() - 1);
            }
            else break;
            
        }
    }
    public List<String> restoreIpAddresses(String s) {
        char[] sc = s.toCharArray();
        backTracking(sc, 0);
        return res;
    }

    public static void main(String[] args) {
        Solution so = new Solution();
        List<String> res = so.restoreIpAddresses("101023");
        for(int i = 0; i < res.size(); i++){
            System.out.println(res.get(i));
        }
    }
}
// @lc code=end

