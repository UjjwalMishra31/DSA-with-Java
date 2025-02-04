package SpringBootTutorial;

import java.util.Scanner;

class HumanResource
{
    private int age;
    private String name;
    static String CollegeName = "Arya College Of Engineering";
    // creating constructor
    public HumanResource()
    {
        age = 15; // default age given to every obj which is created
        name = "Unknown Person";// same as the age
    }
    // creating constructor with already given values
    public HumanResource(int age , String name)
    {
        this.age = age;
        this.name = name;
    }
    public void setAge(int age)
    {
        //age = age ; {this will allot age to age i.e. 0 to 0}
        this.age = age ; // this.age is used to allot age value to the main age instance which is private
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String  getName()
    {
        return name; // returns name as output
    }
    public int getAge()
    {
        return age; // returns age as output
    }

}
public class ConstructorJava
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        HumanResource obj = new HumanResource(); // asks for value from user
        HumanResource obj1 = new HumanResource(12,"Legend"); // uses already assigned values
        HumanResource obj2 = new HumanResource();// uses default values
        System.out.println("Enter person 1 age : ");
        obj.setAge(sc.nextInt());
        System.out.println("Enter person 1 name");
        obj.setName(sc.next());
        // this sout using obj is using the values which we are taking as input
        System.out.println("Age : " + obj.getAge() + "\nName : " + obj.getName() + "\nCollege name : " + HumanResource.CollegeName);
        // this sout using obj1 is using already assigned values to the class
        System.out.println("Age : " + obj1.getAge() + "\nName : " + obj1.getName() + "\nCollege name : " + HumanResource.CollegeName);
        // this sout is using obj3 and is using per defined values using the constructor
        System.out.println("Age : " + obj2.getAge() + "\nName : " + obj2.getName() + "\nCollege name : " + HumanResource.CollegeName);
    }
}
