package Arrays;
public class Solution844 {
    public boolean backspaceCompare(String s, String t) {
        int ls = s.length();
        int lt = t.length();
        StringBuffer s2 = new StringBuffer("");
        StringBuffer t2 = new StringBuffer("");
        for(int i = 0; i < ls; i++){
            if(s.charAt(i) == '#'){
                if(s2.length() != 0){
                    s2.deleteCharAt(s2.length() - 1);
                }

            }
            else {
                s2.append(s.charAt(i));
            }
        }
        for(int j = 0; j < lt; j++){
            if(t.charAt(j) == '#'){
                if(t2.length() != 0){
                    t2.deleteCharAt(t2.length() - 1);
                }
            }
            else{
                t2.append(t.charAt(j));
            }
        }
        //System.out.printf("%s %s", s2, t2);
        return s2.toString().equals(t2.toString());
    }
    public static void main(String[] args) {
        Solution844 so = new Solution844();
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(so.backspaceCompare(s, t));
    }
}
