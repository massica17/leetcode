/*
 * @lc app=leetcode.cn id=860 lang=java
 *
 * [860] 柠檬水找零
 */

// @lc code=start
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        int n = bills.length;
        for(int i = 0; i < n; i++){
            if(bills[i] == 5) five++;
            else if(bills[i] == 10){
                five--;
                ten++;
            }else if(bills[i] == 20){
                if(ten > 0) {
                    ten--;
                    five--;
                }
                else {
                    five -= 3;
                }
            }
            if(five < 0 || ten < 0) return false;
        }
        return true;
    }
}
// @lc code=end

