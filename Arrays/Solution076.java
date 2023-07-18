package Arrays;

public class Solution076 {
    public String minWindow(String s, String t) {
        int ls = s.length();
        int lt = t.length();
        int slow = 0, fast = 0;
        int min = ls;
        int min_slow = 0;
        int min_fast = 0;
        int[] sa = new int[52];
        int[] ta = new int[52];
        boolean find = false;
        for(int i = 0; i < lt; i++){
            ta[getInd(t.charAt(i))]++;
        }
        for(fast = 0; fast < ls; fast++){
            sa[getInd(s.charAt(fast))]++;
            while(slow <= fast && contain(ta, sa)){
                find = true;
                if(min >= fast - slow + 1){
                    min = fast - slow + 1;
                    min_fast = fast;
                    min_slow = slow;
                }
                sa[getInd(s.charAt(slow))]--;
                slow++;
            }
        }
        return !find ? "" : s.substring(min_slow, min_fast + 1);
    }
    public int getInd(char c){
        if(c <= 'z' && c >= 'a'){
            return c - 'a';
        }else if(c <= 'Z' && c >= 'A'){
            return c - 'A' + 26;
        }
        return -1;
    }

    public boolean contain(int[] ta, int[] sa){
        for(int i = 0; i < 52; i++){
            if(sa[i] < ta[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution076 so = new Solution076();
        String res = so.minWindow("a", "a");
        System.out.println(res);
    }
}
