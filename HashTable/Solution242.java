package HashTable;

public class Solution242{
    public boolean isAnagram(String s, String t) {
        int ls = s.length();
        int lt = t.length();
        if(ls != lt){
            return false;
        }
        int[] count = new int[26];
        for(int i = 0; i < ls; i++){
            count[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < lt; i++){
            count[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < 26; i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}