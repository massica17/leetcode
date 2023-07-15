import java.util.*;

public class Solution007 {
    public int reverse(int x) {
        int max = (int)(Math.pow(2, 31) - 1);

        int res = 0;
        boolean positive = x > 0 ? true : false;
        int temp = 0;
        if(!positive){
            x = -x;
        }
        boolean find = false;
        while(x > 0){
            temp = x % 10;
            if(temp != 0 && find == false){
                find = true;
            }
            if(find == false){

            }
            else{
                if(res > max / 10){
                    res = 0;
                    break;
                }
                else if(res == max / 10){
                    if(positive){
                        if(temp > max%10){
                            res = 0;
                            break;
                        }
                    }else {
                        if(temp > max%10 + 1){
                            res = 0;
                            break;
                        }
                    }
                }
                res *= 10;
                res += temp;
            }
            x /= 10;
        }
        if(!positive){
            res = -res;
        }
        return res;
    }
    public static void main(String[] args) {
        Solution007 s = new Solution007();
        int res = s.reverse(-1463847412);
        System.out.println(res);
        System.out.println((int)(Math.pow(2, 31) - 1));
    }
}
