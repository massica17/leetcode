public class Solution011 {
    public int maxArea(int[] height) {
        int max = 0;
        int n = height.length;
        if(n < 2){
            return 0;
        }
        int s = 0;
        int e = n - 1;
        int now = 0;
        while(s < e){
            if(height[s] > height[e]){
                now = height[e] * (e - s);
                e--;
            }else {
                now = height[s] * (e - s);
                s ++;
            }
            max = now >= max ? now : max;
        }
        return max;
    }
    public static void main(String[] args) {
        Solution011 s = new Solution011();
        int res = s.maxArea(null);
        System.out.println(res);
    }
}
