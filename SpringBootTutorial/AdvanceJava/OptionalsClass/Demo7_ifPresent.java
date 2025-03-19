package SpringBootTutorial.AdvanceJava.OptionalsClass;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Demo7_ifPresent
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
        System.out.print("Using ifPresent : ");
        // using direct method , without output if no value found
        optional.ifPresent(System.out::println);

        System.out.println();

        System.out.print("Using ifPresentOrElse : ");
        // using direct method with a message
        optional.ifPresentOrElse(System.out::println, () -> System.out.println("No Student Found"));
    }
}
