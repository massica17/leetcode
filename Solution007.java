import java.util.*;

public class Solution007 {
    public int reverse(int x) {
        int res = 0;
        int max = (int)Math.pow(2,31) - 1;
        int min = (int)Math.pow(2,31);
        Queue <Integer> st = new LinkedList<Integer>();
        boolean flag = false;
        if(x < 0){
            x = -x ;
            flag = true;
        }
        while(x > 0){
            st.add(new Integer(x%10));
            x = x / 10;
        }
        while(! st.empty()){
            Integer temp = st.pop();
            if(res > min / 10){
                return 0;
            }
            res = res * 10;
            if(flag == true){
                if(temp > min - res){
                    return 0;
                }
                else {
                    res += temp;
                }
            }else if (flag == false){
                if(temp > max - res){
                    return 0;
                }
                else{
                    res += temp;
                }
            }
        }
        return flag ? res : -res;
    }
    public static void main(String[] args) {
        Solution007 so = new Solution007();
        int test = (int)Math.pow(2,31) - 1;
        test = 123455677;
        int res = so.reverse(test);
        System.out.println(res);
    }
}
