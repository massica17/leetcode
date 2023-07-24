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
        List<String> staff = new ArrayList<>();
        staff.add("aa");
        staff.add("bb");
        staff.add("cc");
        staff.add("aa");
        staff.add("aa");
        List<String> staff2 = new ArrayList<>();
        staff2.add("aa");
        staff2.add("bb");
        staff2.add("aa");
        staff.retainAll(staff2);
        for(int i = 0; i < staff.size(); i++){
            System.out.println(staff.get(i));
        }
        String[] values = staff.toArray(new String[staff.size()]);

    }
}
