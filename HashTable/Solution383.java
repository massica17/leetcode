package HashTable;
public class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int lr = ransomNote.length();
        int lm = magazine.length();
        if(lr > lm){
            return false;
        }
        int[] asci = new int[26];
        for(int i = 0; i < lm; i++){
            asci[magazine.charAt(i) - 'a']++;
        }
        for(int i = 0; i < lr; i++){
            asci[ransomNote.charAt(i) - 'a']--;
        }
        for(int i = 0; i < 26; i++){
            if(asci[i] < 0){
                return false;
            }
        }
        return true;
    }
}
