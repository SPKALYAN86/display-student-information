import java.util.*;

class RollList
{
    Scanner sc = new Scanner(System.in);
    int[] roll = new int[3];


    public void enterRoll()
    {
        for(int i=0; i<3; i++)
        {
            System.out.println("Enter the roll number: ");
            roll[i]= sc.nextInt();
        }
    }

    public void displayRoll()
    {
        for(int i=0; i<3; i++)
        {
            System.out.println("THE roll number is: "+roll[i]);
        }
    }
}

class NameList
{
    Scanner sc = new Scanner(System.in);
    String[]name = new String[3];


    public void enterName()
    {
        for(int i=0; i<3; i++)
        {
            System.out.println("Enter the name: ");
            name[i]=sc.nextLine();
        }
    }

    public void displayName()
    {
        for(int j=0; j<3;j++)
        {
            System.out.println("The nameis: "+name[j]);
        }
    }
    

}

class StudentList {
    String collegeName, name;
    int rollNumber;

    public void studentDetails(String collegeName, String name, int rollNumber){
        this.collegeName=collegeName;
        this.name=name;
        this.rollNumber=rollNumber;
    }
}

public class Student
{
    public static void main (String[] args)
    {
        RollList obj1 = new RollList();
        obj1.enterRoll();
        obj1.displayRoll();

        NameList obj2 = new NameList();
        obj2.enterName();
        obj2.displayName();
    }
}
