// In This File we will learn Parameterised Constructor
class Student1 {
    String name;
    int age;

    Student1(String n, int a) {  // Parameterized constructor, here We provide the parameter of Constructor
        name = n;
        age = a;
    }

    void display() {                         // Here We Are Printing the data by Using Method
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Para_const  {
    public static void main(String[] args) {
        Student1 s2 = new Student1("Ajay", 22);  // Parameterized constructor called here
        s2.display();
    }
}

