public class Solution008 {
    public int myAtoi(String s) {
        int res = 0;
        int max = (int)(Math.pow(2, 31) - 1);

        s = s.trim();
        int len = s.length();
        if(len == 0){
            return 0;
        }
        char sign = s.charAt(0);
        boolean positive = true;
        int start = 0;
        if(sign == '-'){
            positive = false;
            start = 1;
        }else if(sign == '+'){
            start = 1;
        }else {
            start = 0;
        }
        if(start >= len){
            return 0;
        }
        char temp = s.charAt(start);
        if(! (temp <= '9' && temp >= '0')){
            return 0;
        }
        while(temp == '0'){
            start ++;
            if(start >= len){
                return 0;
            }
            temp = s.charAt(start);
        }
        for(int i = start; i < len ; i++){
            temp = s.charAt(i);
            if(! (temp <= '9' && temp >= '0')){
                break;
            }
            int num = temp - '0';
            if(res > max / 10){
                if(positive){
                    return max;
                }else {
                    return -(max + 1);
                }
            }else if(res == max / 10){
                if(positive){
                    if(num > max % 10){
                        return max;
                    }
                }else {
                    if(num >= max%10 + 1){
                        return -(max + 1);
                    }
                }
            }
            res *= 10;
            res += num;
        }
        return positive ? res : -res;
    }
    public static void main(String[] args) {
        Solution008 s = new Solution008();
        int res = s.myAtoi("-21474836482");
        System.out.println(res);
    }
}
