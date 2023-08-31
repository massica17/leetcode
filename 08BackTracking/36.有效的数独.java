/*
 * @lc app=leetcode.cn id=36 lang=java
 *
 * [36] 有效的数独
 */

// @lc code=start
class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][][] net = new boolean[3][3][9];
        for(int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++) {
                if(board[i][j] == '.') continue;
                int temp = board[i][j] - '1';
                if(row[i][temp]) return false;
                else row[i][temp] = true;

                if(col[j][temp]) return false;
                else col[j][temp] = true;

                if(net[i / 3][j / 3][temp]) return false;
                else net[i / 3][j / 3][temp] = true;
            }
        }
        return true;
    }

}
// @lc code=end

