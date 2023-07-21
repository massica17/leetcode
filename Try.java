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
        Map<String, Integer> m = new HashMap<>();
        System.out.println(m.put("1", 1));
        System.out.println(m.put("1", 1));
        Set<Map >
    }
}
