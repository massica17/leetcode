import java.util.*;

public class Try{
    public static void main(String[] args){
        int[] a =new int[]{2, 4, 66, 23, 456, 76};
        Arrays.sort(a, (Integer o1, Integer o2) -> { return o2.compareTo(o1);});
        for(int i = 0; i < a.length; i++){
            System.out.printf("%d ", a[i]);
        }
    }
}
