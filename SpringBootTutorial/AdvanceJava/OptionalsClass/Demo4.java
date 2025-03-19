package SpringBootTutorial.AdvanceJava.OptionalsClass;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class Demo4
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
        System.out.println("Using orElse ");
        System.out.println();
        Student stud = optional.orElse(new Student());
        System.out.println("Default student : "+stud);
        System.out.println();

        System.out.println("Using orElseGet");
        System.out.println();
        Student stud2 = optional.orElseGet(Student::new);
        System.out.println("Default Stud2 : "+stud2);
    }
}
