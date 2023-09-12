import java.util.*;
public class test1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            int[] nums = new int[n];
            for(int j = 0; j < n; j++){
                nums[j] = sc.nextInt();
            }
            int small_l = 0; //统计小于 l 的步数
            int big_r = 0; //统计大于 r 的步数
            int big_l = 0;  //大于l 小于 r 统计步数
            int small_r = 0;
            for(int j = 0; j < n; j++){
                if(nums[j] < l) small_l += l - nums[j];
                else if(nums[j] > r) big_r += nums[j] - r;
                else{
                    big_l += nums[j] - l;
                    small_r += r - nums[j];
                }
            }
            if(small_l > big_l + big_r || big_r > small_l + small_r){
                System.out.println("-1");
            }
            else{                
                System.out.println(Math.max(small_l, big_r);
            }

        }
        sc.close();
    }
}
