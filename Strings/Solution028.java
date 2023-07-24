package Strings;

public class Solution028 {
    public int[] getNext(String s){
        char[] sc = s.toCharArray();
        int ls = s.length();
        int[] next = new int[ls];
        int j = -1;
        next[0] = j;
        for(int i = 1; i < ls; i++){
            while(j >= 0 && sc[i] != sc[j + 1]){
                j = next[j];
            }
            if(sc[i] == sc[j + 1]){
                j++;
            }
            next[i] = j;
        }
        for(int i = 0; i < ls; i++){
            System.out.printf("%d ", next[i]);
        }
        System.out.println("");
        return next;
    }
    public int strStr(String haystack, String needle) {
        int[] next = getNext(needle);
        int j = -1;
        for(int i = 0; i < haystack.length();i ++){
            while(j >= 0 && haystack.charAt(i)!=needle.charAt(j + 1)){
                j = next[j];
            }
            if(haystack.charAt(i) == needle.charAt(j + 1)){
                j++;
            }
            if(j == needle.length() - 1){
                return i - needle.length() + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution028 so = new Solution028();
        so.strStr("asdddfgggasda", "sda");
    }
}
