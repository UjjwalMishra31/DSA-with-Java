package SpringBootTutorial.AdvanceJava.OptionalsClass;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Demo3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age of the Student : ");
        int Age = sc.nextInt(); // enter 60 if possible to get data
        List<Student> studList = StudData.populateStreamEmployees();
        Optional<Student> optional = studList.stream()
                .filter(emp -> emp.getAge() == Age)
                .findFirst();
        if (optional == null) {
            System.out.println("Your Student is : " + optional.get());
        }
        else {
            System.out.println(new Student());
        }

    }
}
