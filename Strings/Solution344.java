package Strings;

public class Solution344 {
    public void reverseString(char[] s) {
        int len = s.length;
        int le = 0, ri = len - 1;
        char temp = s[0];
        while(le < ri){
            temp = s[le];
            s[le] = s[ri];
            s[ri] = temp; 
            le++;
            ri--;
        }
    }
}
