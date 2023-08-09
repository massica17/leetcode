/*
 * @lc app=leetcode.cn id=135 lang=java
 *
 * [135] 分发糖果
 */

// @lc code=start
import java.util.*;
class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int sum = 0;
        int[] candy = new int[n];
        Arrays.fill(candy, 1);
        for(int i = 1; i < n; i++){
            if(ratings[i] > ratings[i - 1]) candy[i] = candy[i - 1] + 1;
        }
        for(int i = n - 2; i >= 0; i--){
            if(ratings[i + 1] < ratings[i]) candy[i] = Math.max(candy[i], candy[i + 1] + 1);
        }
        for(int i = 0; i < n; i++){
            sum += candy[i];
        }
        return sum;
    }
}
// @lc code=end

