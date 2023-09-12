import java.util.*;

public class test2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<String> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(sc.next());
        }

        int[][][] right = new int[n + 1][m + 1][3];
        int[][][] down = new int[n + 1][m + 1][3];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(arr.get(i - 1).charAt(j - 1) == 'y'){
                    right[i][j][0] = right[i][j - 1][0] + 1;
                    down[i][j][0] = down[i - 1][j][0] + 1;
                }
                else{
                    right[i][j][0] = right[i][j - 1][0];
                    down[i][j][0] = down[i - 1][j][0];
                }

                if(arr.get(i - 1).charAt(j - 1) == 'o'){
                    right[i][j][1] = right[i][j - 1][1] + 1;
                    down[i][j][1] = down[i - 1][j][1] + 1;
                }
                else{
                    right[i][j][1] = right[i][j - 1][1];
                    down[i][j][1] = down[i - 1][j][1];
                }

                if(arr.get(i - 1).charAt(j - 1) == 'u'){
                    right[i][j][2] = right[i][j - 1][2] + 1;
                    down[i][j][2] = down[i - 1][j][2] + 1;
                }
                else{
                    right[i][j][2] = right[i][j - 1][2];
                    down[i][j][2] = down[i - 1][j][2];
                }
            }
        }
        int sum = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(arr.get(i - 1).charAt(j - 1) == 'y'){
                    int n1 = (right[i][m][1] - right[i][j][1]) * (down[n][j][2] - down[i][j][2]) +  (right[i][m][2] - right[i][j][2]) * (down[n][j][1] - down[i][j][1]);
                    int n2 = (right[i][m][1] - right[i][j][1]) * (down[i][j][2] - down[0][j][2]) +  (right[i][m][2] - right[i][j][2]) * (down[i][j][1] - down[0][j][1]);
                    int n3 = (right[i][j][1] - right[i][0][1]) * (down[n][j][2] - down[i][j][2]) +  (right[i][j][2] - right[i][0][2]) * (down[n][j][1] - down[i][j][1]);
                    int n4 = (right[i][j][1] - right[i][0][1]) * (down[i][j][2] - down[0][j][2]) +  (right[i][j][2] - right[i][0][2]) * (down[i][j][1] - down[0][j][1]);
                    sum += n1 + n2 + n3 + n4;
                }
                if(arr.get(i - 1).charAt(j - 1) == 'o'){
                    int n1 = (right[i][m][0] - right[i][j][0]) * (down[n][j][2] - down[i][j][2]) +  (right[i][m][2] - right[i][j][2]) * (down[n][j][0] - down[i][j][0]);
                    int n2 = (right[i][m][0] - right[i][j][0]) * (down[i][j][2] - down[0][j][2]) +  (right[i][m][2] - right[i][j][2]) * (down[i][j][0] - down[0][j][0]);
                    int n3 = (right[i][j][0] - right[i][0][0]) * (down[n][j][2] - down[i][j][2]) +  (right[i][j][2] - right[i][0][2]) * (down[n][j][0] - down[i][j][0]);
                    int n4 = (right[i][j][0] - right[i][0][0]) * (down[i][j][2] - down[0][j][2]) +  (right[i][j][2] - right[i][0][2]) * (down[i][j][0] - down[0][j][0]);
                    sum += n1 + n2 + n3 + n4;
                }
                if(arr.get(i - 1).charAt(j - 1) == 'u'){
                    int n1 = (right[i][m][0] - right[i][j][0]) * (down[n][j][1] - down[i][j][1]) +  (right[i][m][1] - right[i][j][1]) * (down[n][j][0] - down[i][j][0]);
                    int n2 = (right[i][m][0] - right[i][j][0]) * (down[i][j][1] - down[0][j][1]) +  (right[i][m][1] - right[i][j][1]) * (down[i][j][0] - down[0][j][0]);
                    int n3 = (right[i][j][0] - right[i][0][0]) * (down[n][j][1] - down[i][j][1]) +  (right[i][j][1] - right[i][0][1]) * (down[n][j][0] - down[i][j][0]);
                    int n4 = (right[i][j][0] - right[i][0][0]) * (down[i][j][1] - down[0][j][1]) +  (right[i][j][1] - right[i][0][1]) * (down[i][j][0] - down[0][j][0]);
                    sum += n1 + n2 + n3 + n4;
                }
            }
        }
        System.out.println(sum);
        sc.close();

        // int[] row_y = new int[m + 1];
        // int[] row_o = new int[m + 1];
        // int[] row_u = new int[m + 1];
        // int[] col_y = new int[n + 1];  
        // int[] col_o = new int[n + 1];  
        // int[] col_u = new int[n + 1];  

        
        
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= m; j++){
        //         if(arr.get(i - 1).charAt(j - 1) == 'y'){
        //             row_y[j] = row_y[j - 1] + 1;
        //             col_y[i] = col_y[i - 1] + 1;
        //         }
        //         else{
        //             row_y[j] = row_y[j - 1];
        //             col_y[i] = col_y[i - 1];
        //         }
        //         if(arr.get(i - 1).charAt(j - 1) == 'o'){
        //             row_o[j] = row_o[j - 1] + 1;
        //             col_o[i] = col_o[i - 1] + 1;
        //         }
        //         else{
        //             row_o[j] = row_o[j - 1];
        //             col_o[i] = col_o[i - 1];
        //         }

        //         if(arr.get(i - 1).charAt(j - 1) == 'u'){
        //             row_u[j] = row_u[j - 1] + 1;
        //             col_u[i] = col_u[i - 1] + 1;
        //         }
        //         else{
        //             row_u[j] = row_u[j - 1];
        //             col_u[i] = col_u[i - 1];
        //         }
        //     }
        // }
        // System.out.println(Arrays.toString(row_y));
        // System.out.println(Arrays.toString(row_o));
        // System.out.println(Arrays.toString(row_u));
        // System.out.println(Arrays.toString(col_y));
        // System.out.println(Arrays.toString(col_o));
        // System.out.println(Arrays.toString(col_u));
        
        // int sum = 0;
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < m; j++){
        //         if(arr.get(i).charAt(j) == 'y'){
        //             int n1 = (row_u[n] - row_u[j]) * (col_o[n] - col_o[i]) + (row_o[n] - row_o[j]) * (col_u[n] - col_u[i]);
        //             int n2 = (row_u[n] - row_u[j]) * (col_o[i] - col_o[0]) + (row_o[n] - row_o[j]) * (col_u[i] - col_u[0]);
        //             int n3 = (row_u[i] - row_u[0]) * (col_o[n] - col_o[i]) + (row_o[n] - row_o[j]) * (col_u[i] - col_u[0]);
        //             int n4 = (row_u[i] - row_u[0]) * (col_o[i] - col_o[0]) + (row_o[i] - row_o[0]) * (col_u[i] - col_u[0]);
        //             sum += n1 + n2 + n3 + n4;
        //         }

        //         if(arr.get(i).charAt(j) == 'u'){
        //             int n1 = (row_y[n] - row_y[j]) * (col_o[n] - col_o[i]) + (row_o[n] - row_o[j]) * (col_y[n] - col_y[i]);
        //             int n2 = (row_y[n] - row_y[j]) * (col_o[i] - col_o[0]) + (row_o[n] - row_o[j]) * (col_y[i] - col_y[0]);
        //             int n3 = (row_y[i] - row_y[0]) * (col_o[n] - col_o[i]) + (row_o[n] - row_o[j]) * (col_y[i] - col_y[0]);
        //             int n4 = (row_y[i] - row_y[0]) * (col_o[i] - col_o[0]) + (row_o[i] - row_o[0]) * (col_y[i] - col_y[0]);
        //             sum += n1 + n2 + n3 + n4;
        //         }

        //         if(arr.get(i).charAt(j) == 'o'){
        //             int n1 = (row_u[n] - row_u[j]) * (col_y[n] - col_y[i]) + (row_y[n] - row_y[j]) * (col_u[n] - col_u[i]);
        //             int n2 = (row_u[n] - row_u[j]) * (col_y[i] - col_y[0]) + (row_y[n] - row_y[j]) * (col_u[i] - col_u[0]);
        //             int n3 = (row_u[i] - row_u[0]) * (col_y[n] - col_y[i]) + (row_y[n] - row_y[j]) * (col_u[i] - col_u[0]);
        //             int n4 = (row_u[i] - row_u[0]) * (col_y[i] - col_y[0]) + (row_y[i] - row_y[0]) * (col_u[i] - col_u[0]);
        //             sum += n1 + n2 + n3 + n4;
        //         }
        //     }
        // }
        // System.out.println(sum);
        // sc.close();
    }
}