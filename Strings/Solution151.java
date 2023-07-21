package Strings;

import java.util.ArrayList;
import java.util.List;

public class Solution151 {
    public String reverseWords(String s) {
        s = s.trim();
        int ls = s.length();
        int slow = 0;
        int fast = 0;
        List<String> res = new ArrayList<>();
        for(int i = 1; i < ls; i++){
            if(s.charAt(i) != ' ' && s.charAt(i - 1) == ' '){
                slow = i;
            }
            
            if(s.charAt(i) == ' ' && s.charAt(i - 1) != ' '){
                fast = i;
                res.add(s.substring(slow, fast));
            }
            else if(i == ls - 1){
                fast = i + 1;
                res.add(s.substring(slow, fast));
                
            } 
        }
        int size = res.size();
        if(size == 0){
            return s;
        }
        String res_s = res.get(size - 1);
        for(int i = size - 2; i >= 0; i--){
            res_s += " " + res.get(i);
        }
        return res_s;
    }
    public static void main(String[] args) {
        Solution151 so = new Solution151();
        System.out.println(so.reverseWords("F R  I   E    N     D      S      "));
    }
}
