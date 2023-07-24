package StackAndQueue;

import java.util.Stack;

public class Solution150 {
    public int getNum(String s){
        int ls = s.length();
        int res = 0;
        boolean flag = false;
        if(s.charAt(0) == '-'){
            flag = true;
            s = s.substring(1, ls);
        }
        for(int i = 0; i < s.length(); i++){
            res = res * 10;
            res += s.charAt(i) - '0';
        }
        return flag ? -res : res;
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> res  = new Stack<>();
        int ls = tokens.length;
        int a = 0, b = 0;
        for(int i = 0; i < ls; i++){
            if(tokens[i].equals("+")){
                b = res.pop();
                a = res.pop();
                res.push(a + b);
            }
            else if(tokens[i].equals("*")){
                b = res.pop();
                a = res.pop();
                res.push(a * b);
            }
            else if(tokens[i].equals("-")){
                b = res.pop();
                a = res.pop();
                res.push(a - b);
            }
            else if(tokens[i].equals("/")){
                b = res.pop();
                a = res.pop();
                res.push(a / b);
            }
            else{
                a = getNum(tokens[i]);
                res.push(a);
            }
            System.out.printf("%d %d%n", b, a);
        }
        return res.pop();
    }
}
