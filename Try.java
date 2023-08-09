import java.util.*;
import java.awt.*;
import java.time.Period;

import javax.swing.*;
public class Try{
    public static void main(String[] args){
        Student s = new Student("student", 12, 100);
        Person p = new Person("person", 13);
        Person[] t = new Person[]{s, p};
        for(int i = 0; i < t.length; i++){
            t[i].display();
        }
        
    }
}

class Person{
    public String name;
    public int age;
    public Person(){
        name = "none";
        age = 0;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.printf("name:%s age:%d %n", this.name, this.age);
    }
}

class Student extends Person{
    public int grad = 0;
    public Student(){
        super();
        grad = 0;
    }
    public Student(String name, int age, int grad){
        super(name, age);
        this.grad = grad;
    }

    public void display(){
        System.out.printf("name:%s age:%d grad:%d %n", super.name, this.age, this.grad);
    }
}
