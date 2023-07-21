package HashTable;

import java.util.HashSet;
import java.util.Set;

public class Solution202 {

    public int change(int a){
        int sum = 0;
        int al = 0;
        while(a > 0){
            al = a % 10;
            sum += al * al;
            a /= 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        Set<Integer> sum = new HashSet<Integer>();
        int s = n;
        while(true){
            s = change(s);
            if(s == 1){
                return true;
            }
            if(sum.contains(s)){
                return false;
            }
            else {
                sum.add(s);
            }
        }
    }
}
