import java.util.*;

class Student {
    int roll;
    String name;
    double cgpa;
    
    public Student(String name, int roll, double cgpa)
    {
        this.name=name;
        this.roll=roll;
        this.cgpa=cgpa;
    }
}


public class main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter roll");
        int r = sc.nextInt();

        Student sukalyan = new Student("sukalyan panda", r, 7.5); // creating a new object

        System.out.println(sukalyan.name); // null
        System.out.println(sukalyan.roll); // 0
        System.out.println(sukalyan.cgpa); // 0.0
        
    }
}
