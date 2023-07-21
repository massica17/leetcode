package HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution438 {
    public boolean contain(int[]a , int[] b){
        for(int i = 0; i < 26; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    } 

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int ls = s.length();
        int lp = p.length();
        if(ls < lp){
            return res;
        }
        int[] p_asc = new int[26];
        int[] s_asc = new int[26];
        for(int i = 0; i < lp; i++){
            p_asc[p.charAt(i) - 'a']++;
            s_asc[s.charAt(i) - 'a']++;
        }
        if(contain(p_asc, s_asc)){
            res.add(0);
        }
        for(int i = 1; i <= ls - lp; i++){
            s_asc[s.charAt(i-1) - 'a']--;
            s_asc[s.charAt(i+lp-1) - 'a']++;
            if(contain(p_asc, s_asc)){
                res.add(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution438 so = new Solution438();
        List<Integer> res = so.findAnagrams("a", "a");
        for(int i = 0; i < res.size(); i++){
            System.out.println(res.get(i));
        }
    }
}
