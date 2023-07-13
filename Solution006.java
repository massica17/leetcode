
class Solution006 {
    public String convert(String s, int numRows) {
        String res = "";
        int len = s.length();
        if(numRows == 1){
            return s;
        }
        for(int i = 0 ; i < numRows; i++){
            if(0 == i){
                int j = 0;
                while(j * (2 * numRows -2 ) < len){
                    res += s.charAt(j * (2 * numRows -2 )); 
                    j ++;
                }
            }else if (numRows - 1 == i){
                int j = 0;
                while(numRows - 1 + j * (2 * numRows -2 ) < len){
                    res += s.charAt(numRows - 1 + j * (2 * numRows - 2));
                    j ++ ;
                }
            }else{
                int j = 0;
                int ind1 = 0;
                int ind2 = 0;
                while(true){
                    ind1 = i + j * (2 * numRows - 2);
                    ind2 = ind1 + 2 * numRows - 2 - 2 * i;
                    if(ind1 < len){
                        res += s.charAt(ind1);
                    }
                    if(ind2 < len){
                        res += s.charAt(ind2);
                    }
                    if(ind1 >= len && ind2 >= len){
                        break;
                    }
                    j ++;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Solution006 sol= new Solution006();
        String res = sol.convert("PAYPALISHIRING", 3);
        System.out.println(res);
    }
}