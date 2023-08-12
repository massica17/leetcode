/*
 * @lc app=leetcode.cn id=51 lang=java
 *
 * [51] N 皇后
 */

// @lc code=start
import java.util.*;
class Solution {
    private char[][] map;
    private int[][] hs;
    private int[] w;
    private List<List<String>> res = new ArrayList<>();
    private void backTracking(int start, int n){
        /*
        System.out.println();
        for(int i = 0; i < n;i++){
            for(int j = 0; j < n; j++){
                System.out.printf("%d ", hs[i][j]);
            }
            System.out.println();
        } */
        if(start == n){
            List<String> res_u = new ArrayList<>();
            for(int i = 0; i < n; i++){
                res_u.add(String.valueOf(map[i]));
                //System.out.println(String.valueOf(map[i]));
            }
            System.out.println("case");
            res.add(res_u);
            return;
        }
        int temp = 0;
        for(int i = 0; i < n; i++){
            if(w[i] == 0 && hs[start][i] == 0){
                w[i] = 1;
                map[start][i] = 'Q';
                while((temp + i) < n && (start + temp) < n){
                    hs[temp + start][temp + i] ++;
                    temp++;
                }
                temp = 0;
                while((i - temp) >= 0 && (start - temp) >= 0){
                    hs[start - temp][i - temp] ++;
                    temp++;
                }
                temp = 0;
                while((i - temp) >= 0 && (start + temp) < n){
                    hs[start + temp][i - temp] ++;
                    temp++;
                }
                temp = 0;
                while((i + temp) < n && (start - temp) >= 0){
                    hs[start - temp][i + temp] ++;
                    temp++;
                }
                temp = 0;
                backTracking(start + 1, n);
                while((temp + i) < n && (start + temp) < n){
                    hs[temp + start][temp + i] --;
                    temp++;
                }
                temp = 0;
                while((i - temp) >= 0 && (start - temp) >= 0){
                    hs[start - temp][i - temp] --;
                    temp++;
                }
                temp = 0;
                while((i - temp) >= 0 && (start + temp) < n){
                    hs[start + temp][i - temp] --;
                    temp++;
                }
                temp = 0;
                while((i + temp) < n && (start - temp) >= 0){
                    hs[start - temp][i + temp] --;
                    temp++;
                }
                temp = 0;
                map[start][i] = '.';
                w[i] = 0;
            }
            else continue;
        }
    }
    public List<List<String>> solveNQueens(int n) {
        map = new char[n][n];
        hs = new int[n][n];
        w = new int[n];
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < n; j++){
                map[i][j] = '.';
                hs[i][j] = 0;
            }
        }
        backTracking(0, n);
        return res;
    }
    
}
// @lc code=end

