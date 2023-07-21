package Strings;

public class Solution541{
    public void reversek(char[] sc, int left, int right){
        char temp = 'c';
        while(left < right){
            temp = sc[left];
            sc[left] = sc[right];
            sc[right] = temp;
            left++;
            right--;
        }
    }
    public String reverseStr(String s, int k) {
        char[] sc = s.toCharArray();
        int count = s.length() / (2*k);
        int last = s.length() % (2*k);
        int start = 0;
        for(int i = 0; i < count; i++){
            start = i * 2 * k;
            //System.out.printf("%d %d%n", start, start + k - 1);
            reversek(sc, start, start + k - 1);
        }
        if(last == 0){
            return String.valueOf(sc);
        }
        if(last < k){
            start = count * 2 * k;
            reversek(sc, start, start + last - 1);
        }
        else {
            start = count * 2 * k;
            reversek(sc, start, start + k - 1);
        }
        return String.valueOf(sc);
    }
    public static void main(String[] args) {
        Solution541 so = new Solution541();
        System.out.println(so.reverseStr("abcdefg", 2));
    }
}