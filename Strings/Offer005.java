package Strings;

public class Offer005 {
    public String replaceSpace(String s) {
        int len = s.length();
        int count = 0;
        for(int i = 0; i < len; i++){
            if(s.charAt(i) == ' '){
                count++;
            }
        }
        int len_res = len + count * 2;
        char[] res = new char[len_res];
        int j = 0;
        for(int i = 0; i < len; i++){
            if(s.charAt(i) == ' '){
                res[j++] = '%';
                res[j++] = '2';
                res[j++] = '0'; 
            }
            else{
                res[j++] = s.charAt(i);
            }
        }
        return String.valueOf(res);
    }
}
