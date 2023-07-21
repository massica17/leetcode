package Strings;

public class Offer058 {

    public void reverse(char[] sc, int left, int right){
        char temp = 'c';
        while(left < right){
            temp = sc[left];
            sc[left] = sc[right];
            sc[right] = temp;
            left++;
            right--;
        }
    }

    public String reverseLeftWords(String s, int n) {
        char[] cs = s.toCharArray();
        int ls = s.length();
        reverse(cs, 0, ls - 1);
        reverse(cs, 0, ls - n - 1);
        reverse(cs, ls - n, s.length() - 1);
        return String.valueOf(cs);
    }
}
