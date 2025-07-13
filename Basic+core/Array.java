class student{
    int rollNo;
    String name;
    int marks;
}
public class Array {
    public static void main(String[] args) {
        // int arr[] = {5,6,7,8,9};  // Custom Array in Java
        // System.out.println(arr);
        // arr[2] = 10;
        // System.out.println(arr[2]);
        student s1 = new student();
        s1.rollNo = 101;
        s1.name = "Ajay";
        s1.marks = 78;
        
        student s2 = new student();
        s2.rollNo = 103;
        s2.name = "Sanjay";
        s2.marks = 67;
        
        student s3 = new student();
        s3.rollNo = 105;
        s3.name = "vikash";
        s3.marks = 89;

        student students[] = new student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for (int i = 0; i < students.length; i++) {   // Normal for loop
        //     System.out.println(students[i].name + " " + students[i].marks);
            
        // }

        // 😍😍😍😍😍😍Another Way😍😍😍😍😍😍
        // Enhanced/for Each loop 
        for (student stud : students) {
            System.out.println(stud.name + " :" +stud.marks);
        }
        int num[] = new int[4];
        num[0] = 4;
        num[1] = 9;
        num[2] = 7;
        num[3] = 12;

        System.out.println(" Here This is a for each or enhance loop: This is an array of Elements \" " );
        for (int n : num) 
        {
            System.out.println("Here the value of n is: " + n);
        }

        int age[] = new int[4];
        age[0] = 20;
        age[1] = 23;
        age[2] = 25;
        age[3] = 27;
        // for each loop

        for(int ag : age)
        {
            System.out.println(ag);
        }
    }
}
