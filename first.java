class Student
{
    int roll;
    String name;
    double cgpa=cgpa;
    public Student(String name ,int roll , double cgpa)
     {
         this.name = name;
         this.roll = roll;
         this.cgpa = cgpa;
     }
}
 class main{
    public static void main(String[] args) {


        // user input for all the parameters
        // cgpa via array
        Student sukalyan = new Student("Sukalyan panda",28,7.0);
         System.out.println("Details for"+" " +sukalyan.name);
         System.out.println("name:" +sukalyan.name);
          System.out.println("roll:"+sukalyan.roll);
           System.out.println("cgpa:"+sukalyan.cgpa);
           
           Student abhishek = new Student("Abhishek",13,8.0);
            System.out.println("Details for"+ " " +abhishek.name);
            System.out.println("name:"+abhishek.name);
            System.out.println("roll:"+abhishek.roll);
            System.out.println("cgpa:"+abhishek.cgpa);
           
            Student sayan = new Student("Sayan",27,8.5);
            System.out.println("Details for"+ " " +sayan.name);
            System.out.println("name:"+sayan.name);
          System.out.println("roll:"+sayan.roll);
           System.out.println("cgpa:"+sayan.cgpa);
           
           
    }
}
