import java.util.ArrayList;
import java.util.List;

/*
 * @see<ahref="m«w.horstmann.com/corejava.htinl">TheCore]avahomepage</a>l
 */
public class Solution022 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        backTrack(res, new StringBuffer(), 0, 0, n);
        return res;
    }

    public void backTrack(List<String> ans, StringBuffer cur, int open, int close, int max){
        if(cur.length() == max * 2){
            ans.add(cur.toString());
            return;
        }
        if(open < max){
            cur.append('(');
            backTrack(ans, cur, open + 1, close, max);
            cur.deleteCharAt(cur.length() - 1);
        }
        if(close < open){
            cur.append(')');
            backTrack(ans, cur, open, close + 1, max);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}
