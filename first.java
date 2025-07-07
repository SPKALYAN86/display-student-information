import java.util.*;
class Student
{
    int roll;
    String name;
    double cgpa;
    public Student(String i ,int j , double k)
    {
        this.name = i;
        this.roll = j;
        this.cgpa = k;
    }
}
class main{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // user input for all the parameters
        // cgpa via array
        String first = scan.nextLine();
        int second = scan.nextInt();
        double third= scan.nextDouble();

        Student obj1 = new Student(first,second,third);
        scan.nextLine();

        String one = scan.nextLine();
        int two = scan.nextInt();
        double three= scan.nextDouble();
        Student obj2 = new Student(one,two,three);
         scan.nextLine();
        String num1 = scan.nextLine();
        int num2 = scan.nextInt();
        double num3= scan.nextDouble();
        Student obj3 = new Student(num1,num2,num3);
          
        System.out.println("name:"+obj1.name+" "+"roll:"+obj1.roll+" "+"cgpa:"+obj1.cgpa);
        System.out.println("name:"+obj2.name+" "+"roll:"+obj2.roll+" "+"cgpa:"+obj2.cgpa);
        System.out.println("cgpa:"+obj3.name+" "+"roll:"+obj3.roll+" "+"cgpa:"+obj3.cgpa);


    }

}


