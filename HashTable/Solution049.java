package HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution049 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>();
        int size = strs.length;
        int[][] table = new int[size][26];
        for(int i = 0; i < size; i++){
            int ls = strs[i].length();
            for(int j = 0; j < ls; j++){
                table[i][strs[i].charAt(j) - 'a']++;
            }
        }
        boolean[] find = new boolean[size];
        for(int i = 0; i < size; i++){
            if(find[i]){
                continue;
            }
            List<String> res_u = new ArrayList<String>();
            res_u.add(strs[i]);
            for(int j = 0; j < size; j++){
                boolean same = true;
                if(!find[j] && i != j){
                    for(int k = 0; k < 26; k++){
                        if(!(table[i][k] == table[j][k])){
                            same = false;
                            break;
                        }
                    }
                    if(same){
                        res_u.add(strs[j]);
                        find[j] = true;
                    }
                }
            }
            res.add(res_u);
        }
        return res;
    }

    public List<List<String>> groupAnagrams_fast(String[] strs){
        List<List<String>> res = new ArrayList<List<String>>();
        int ls = strs.length;
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for(int i = 0; i < ls; i++){
            String key = change(strs[i]);
            if(map.containsKey(key)){
                map.get(key).add(strs[i]);
            }
            else{
                List<String> res_u = new ArrayList<String>();
                res_u.add(strs[i]);
                map.put(key, res_u);
            }
        }
        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            res.add(entry.getValue());
        }
        return res;
    }

    public String change(String s){
        char[] cs = s.toCharArray();
        Arrays.sort(cs);
        return cs.toString();
    }
}
