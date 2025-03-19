package SpringBootTutorial.AdvanceJava.OptionalsClass;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Demo8_ofNullable_Empty
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
        // when u know list is null or may not be null then
        System.out.println();

        Optional<List<Student>> studopt = Optional.ofNullable(StudData.populateStreamEmployees());

        studopt.ifPresentOrElse(System.out::println,() -> System.out.println("No student Found studopt"));

        // when u know list is 100% empty
        List<Student> studlist2 = null;

        Optional<List<Student>> optionalStudents2 = Optional.empty();

        optionalStudents2.ifPresentOrElse(System.out::println,()-> System.out.println("No Student Found in StudList2"));
    }
}
