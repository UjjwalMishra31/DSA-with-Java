package SpringBootTutorial.Tutorial_CoreJava;

import java.util.Scanner;

class Human
{
    private int age;
    private String name;
    static String CollegeName = "Arya College Of Engineering";
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

public class Encapsulation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        HumanResource obj = new HumanResource();
        System.out.println("Enter person 1 age : ");
        obj.setAge(sc.nextInt());
        System.out.println("Enter person 1 name");
        obj.setName(sc.next());
        System.out.println("Age : "+obj.getAge() + "\nName : "+obj.getName()+"\nCollege name : "+ HumanResource.CollegeName);
    }
}
