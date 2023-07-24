package StackAndQueue;
import java.util.*;
public class Solution020 {
    public boolean isValid(String s) {
        Stack<Character> sc = new Stack<>();
        Map<Character, Integer> c = new HashMap<Character, Integer>();
        c.put('(', 1);
        c.put('[', 2);
        c.put('{', 3);
        c.put(')', 4);
        c.put(']', 5);
        c.put('}', 6);
        int ls = s.length();
        int v = 0;
        int v_t = 0;
        for(int i = 0; i < ls; i++){
            v = c.get(s.charAt(i));
            if(v <= 3){
                sc.push(s.charAt(i));
            }
            else{
                if(sc.empty()){
                    return false;
                }
                else{
                    v_t = c.get(sc.pop());
                    System.out.printf("%d %d%n", v, v_t);
                    if(v_t - v != -3){
                        return false;
                    }
                }
            }
        }
        return sc.empty() ? true : false;
    }
}
