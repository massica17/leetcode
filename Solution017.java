import java.util.ArrayList;
import java.util.List;

public class Solution017 {

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        String[] nums = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        int len = digits.length();
        int old_n = 0;
        if(len == 0){
            return res;
        }
        int n = digits.charAt(0) - '2';
        for(int j = 0 ; j < nums[n].length(); j++){
            res.add("" + nums[n].charAt(j));
        }
        if(len == 1){
            return res;
        }
        for(int i = 1 ; i < len ; i++){
            n = digits.charAt(i) - '2';
            old_n = res.size();
            for(int j = 0 ; j < old_n; j++){
                for(int k = 0 ; k < nums[n].length(); k++){
                    String res_u = res.get(j) + nums[n].charAt(k);
                    res.add(res_u);
                }
            }
            while(old_n > 0){
                res.remove(0);
                old_n --;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Solution017 s = new Solution017();
        List<String> res = s.letterCombinations("2349");
        for(int i = 0 ; i < res.size(); i++){
            System.out.printf("%s ", res.get(i));
        }
    }
}
