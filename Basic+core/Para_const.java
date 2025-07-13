
class Student1 {
    String name;
    int age;

    Student1(String n, int a) {  // Parameterized constructor
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Para_const  {
    public static void main(String[] args) {
        Student1 s2 = new Student1("Ajay", 22);  // Parameterized constructor called
        s2.display();
    }
}

