package Arrays;

public class Solution059 {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int count = 1;
        int loop = 1;
        while(2 * loop <= n){
            for(int i = loop; i <= n - loop; i++){
                ans[loop - 1][i -1] = count;
                count++;
            }
            for(int i = loop; i <= n-loop; i++){
                ans[i - 1][n - loop] = count;
                count++;
            }
            for(int i = n - loop + 1; i >= loop + 1; i--){
                ans[n - loop][i - 1] = count;
                count++;
            }
            for(int i = n - loop + 1; i >= loop + 1; i--){
                ans[i - 1][loop - 1] = count;
                count++;
            }
            loop += 1;
        }
        if(n % 2 != 0){
            ans[n / 2][n / 2] = count;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution059 so = new Solution059();
        int n = 3;
        int[][] res = so.generateMatrix(n);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.printf("%d ", res[i][j]);
            }
            System.out.println("");
        }
    }
}
