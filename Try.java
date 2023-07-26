import java.io.*;
import java.nio.file.Paths;
import java.util.*;
import java.time.LocalDate;
public class Try{

    private int age = 0;

    public class TryInter{
        private int iage = age;

        public void print(){
            System.out.println(iage);
        }
    }
    public static String change(String s) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            return String.valueOf(chars);
    }
    public static void main(String[] args) throws IOException{
        TreeNode root = new TreeNode(0);
        root.left = null;
        root.right = new TreeNode(1);
        TreeNode temp = root.left;
        temp = root.right;
        System.out.println(temp.val);
    }
}


 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
 