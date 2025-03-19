package SpringBootTutorial.AdvanceJava.OptionalsClass;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Demo5_orElseThrow
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age");
        int Age = sc.nextInt();
        List<Student> list = StudData.populateStreamEmployees();
        Optional<Student> optional = list.stream()
                .filter(stud -> stud.getAge() == Age)
                .findFirst();
        try {
            // if no value found , ArithmeticException will get printed with the message provided
            Student stud = optional.orElseThrow(() -> new ArithmeticException("No value Found"));
            System.out.println(stud);
        }catch (Exception e)
        {
            System.out.println(e);
        }
        try {
            // if no value found , ArithmeticException will get printed with the message provided
            Student stud2 = optional.orElseThrow(() -> new ArithmeticException("No value Found"));
            System.out.println(stud2);
        }catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
