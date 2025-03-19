package SpringBootTutorial.AdvanceJava.OptionalsClass;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Demo6_Present_Empty
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the student");
        int Age = sc.nextInt();
        List<Student> studList = StudData.populateStreamEmployees();
        Optional<Student> optional = studList.stream()
                .filter(stud -> stud.getAge()==Age)
                .findFirst();
        System.out.print("Using isPresent : ");
        if (optional.isPresent())
        {
            System.out.println(optional.get());
        } else
        {
            System.out.println("No Student Found");
        }
        System.out.println();
        System.out.print("Using isEmpty : ");
        if (optional.isEmpty())
        {
            System.out.println("No Student Found");
        }else
        {
            System.out.println(optional.get());
        }
        System.out.println();
    }
}
