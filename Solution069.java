public class Solution069 {
    public int mySqrt(int x) {
        if(x == 0 || x == 1){
            return x;
        }
        int l = x / 2;
        while(l >= x / l){
            l = l / 2;
        }
        int r = l * 2;
        //System.out.printf("%d %d%n", l, r);
        int mid = 0;
        while(l <= r){
            mid = l + (r -l) / 2;
            if(mid == x / mid){
                return mid;
            }
            if(mid > x / mid){
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
            //System.out.printf("%d %d%n", l, r);
        }
        if(mid > x / mid){
            return mid - 1;
        }
        return mid;
    }
    public static void main(String[] args) {
        Solution069 s = new Solution069();
        int res = s.mySqrt(2147395599);
    }
}
