public class Generator<T extends Student> implements InterfaceGenerator<T>{
    T key;
    Generator(){
        this.key = null;
    }

    Generator(T key){
        this.key = key;
    }

    public void print(){
        System.out.println(key);
    }

    public T getKey(){
        return this.key;
    }

    public static void main(String[] args) {
        Generator<HS> g = new Generator<HS>(new HS(12));
        
        g.print();
    }
}

class Student {
    int age;
    Student(){
        age = 0;
    }
    Student(int age){
        this.age = age;
    }

    public void print(){

    }
}

class HS extends Student{
    int grad;
    HS(){
        grad = 0;
    }
    HS(int grad){
        super.age = 12;
        this.grad = grad;
    }

    @Override
    public void print(){
        System.out.printf("%d %d%n", age, grad);
    }

    @Override
    public String toString(){
        return "" + age + " " + grad;
    }
}
interface InterfaceGenerator<T extends HS2>{
    public T getKey();
}

interface HS2{

}