package Arrays;
public class Solution367 {
    public boolean isPerfectSquare(int num){
        if(num == 0 || num == 1){
            return true;
        }
        int l = num / 2;
        while(l > num / l){
            l = l / 2;
        }
        int r = l * 2;
        int mid = 0;
        while(l <= r){
            mid = l + (r - l) / 2;
            if(mid == num / mid){
                break;
            }
            if(mid < num / mid){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        if(mid * mid == num || (mid + 1) * (mid + 10) == num){
            return true;
        }
        return false;
    }
}
