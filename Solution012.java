public class Solution012 {
    public String intToRoman(int num) {
        String res = "";
        int m_num = num / 1000;
        if(m_num > 0){
            String s_m = "";
            for(int i = 0 ; i < m_num ; i++){
                s_m = s_m + "M";
            }
            res = res + s_m;
            num = num - m_num * 1000;
        }

        int c_num = num / 100;
        if(c_num > 0){
            String c_m = "";
            if(c_num < 4){
                for(int i = 0 ; i < c_num; i++){
                    c_m = c_m + "C";
                }
            }else if(c_num == 4){
                c_m = "CD";
            }else if(c_num == 5){
                c_m = "D";
            }else if(c_num > 5 && c_num < 9){
                c_m = "D";
                for(int i = 0 ; i < c_num - 5; i++){
                    c_m += "C";
                }
            }else if(c_num == 9){
                c_m = "CM";
            }
            res += c_m;
            num = num - c_num * 100;
        }

        int x_num = num / 10;
        if(x_num > 0){
            String x_m = "";
            if(x_num < 4){
                for(int i = 0 ; i < x_num; i++){
                    x_m = x_m + "X";
                }
            }else if(x_num == 4){
                x_m = "XL";
            }else if(x_num == 5){
                x_m = "L";
            }else if(x_num > 5 && x_num < 9){
                x_m = "L";
                for(int i = 0 ; i < x_num - 5; i++){
                    x_m += "X";
                }
            }else if(x_num == 9){
                x_m = "XC";
            }
            res += x_m;
            num = num - x_num * 10;
        }

        int i_num = num / 1;
        if(i_num > 0){
            String i_m = "";
            if(i_num < 4){
                for(int i = 0 ; i < i_num; i++){
                    i_m = i_m + "I";
                }
            }else if(i_num == 4){
                i_m = "IV";
            }else if(i_num == 5){
                i_m = "V";
            }else if(i_num > 5 && i_num < 9){
                i_m = "V";
                for(int i = 0 ; i < i_num - 5; i++){
                    i_m += "I";
                }
            }else if(i_num == 9){
                i_m = "IX";
            }
            res += i_m;
            num = num - i_num * 1;
        }
        
        return res;
    }
    public static void main(String[] args) {
        Solution012 s = new Solution012();
        String res = s.intToRoman(9);
        System.out.println(res);
    }
}
