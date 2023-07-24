package StackAndQueue;

import java.util.Stack;

public class Solution1047 {
    public String removeDuplicates(String s) {
        int ls = s.length();
        Stack<Character> sc = new Stack<>();
        for(int i = 0; i < ls; i++){
            if(sc.empty() || sc.peek() != s.charAt(i)){
                sc.push(s.charAt(i));
            }
            else{
                sc.pop();
            }
        }
        int size = sc.size();
        char[] res = new char[size];
        while(!sc.empty()){
            res[--size] = sc.pop();
        }
        return String.valueOf(res);
    }
}
