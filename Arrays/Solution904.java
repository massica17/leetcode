package Arrays;
public class Solution904 {
    public int totalFruit(int[] fruits) {
        int s = 0;
        int f = 0;
        int res = 0;
        int len = fruits.length;
        if(len <= 2){
            return len;
        }
        int[] now = new int[]{fruits[0], fruits[1]};
        int temp_len = 0;
        for(f = 1; f < len; f++){
            if(now[0] != fruits[f] && now[1] != fruits[f]){
                now[0] = fruits[f -1];
                now[1] = fruits[f];
                s = f;
                for(int i = f; i >= 0; i--){
                    if(fruits[i] == now[0] || fruits[i] == now[1]){
                        s = i;
                    }
                    else{
                        break;
                    }
                }
            }
            temp_len = f - s + 1;
            if(res < temp_len){
                res = temp_len;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Solution904 so = new Solution904();
        int[] s = new int[]{0,1,2,2};
        int res = so.totalFruit(s);
        System.out.println(res);
    }
}
