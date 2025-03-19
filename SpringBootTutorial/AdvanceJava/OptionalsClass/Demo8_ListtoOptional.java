package SpringBootTutorial.AdvanceJava.OptionalsClass;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Demo8_ListtoOptional
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age of the student");
        int Age = sc.nextInt();
        List<Student> studlist = StudData.populateStreamEmployees();

        Optional<Student> studentOptional = studlist.stream()
                .filter(student -> student.getAge() == Age)
                .findFirst();
        studentOptional.ifPresentOrElse(System.out::println,() -> System.out.println("No Student Found"));
        Optional<List<Student>> optional = Optional.of(StudData.populateStreamEmployees());

        optional.ifPresentOrElse(
                students -> students.forEach(System.out::println),  // Print each student
                () -> System.out.println("No Students Found")
        );

    }
}
