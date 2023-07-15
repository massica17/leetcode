import java.io.Console;
import java.io.*;
import java.nio.file.Paths;
import java.util.*;
import java.time.LocalDate;
public class Try{
    public static void swap(Employee a, Employee b){
        Employee temp = a;
        a = b;
        b = temp;
    }
    public static void change(Employee a){
        a.setName("ss");
        a.setSalary(34);
    }
    public static void main(String[] args) throws IOException{
       Employee e = new Employee("a", 0);
       System.out.println(e.toString());
       Employee e2 = new Employee("a", 0);
       System.out.println(e2.toString());
    }
}

class Employee{
    private String name;
    private int salary;
    private static int init = 0;
    static 
    {
        init = init + 1;
    }

    Employee(String name, int salary){
        this.name = name ;
        this.salary = salary;
    }
    
    public String toString(){
        return name + " " + salary + " " + init;
    }

    public void setSalary(int a){
        this.salary = a;
    }

    public void setName(String name){
        this.name = name;
    }
}