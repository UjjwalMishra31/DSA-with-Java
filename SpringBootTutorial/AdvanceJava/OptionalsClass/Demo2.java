package SpringBootTutorial.AdvanceJava.OptionalsClass;

import java.util.Optional;

public class Demo2
{
    public static void main(String[] args) {
        System.out.println(fetchStudByMarks(60));
        System.out.println(fetchStudByMarks(66));
    }

    public static Optional<Student> fetchStudByMarks(int Age) {
        /*
         * Fetch the list of employees using GeneratorUtil.populateEmployees(). Iterate
         * over the list. Return first employee whose marks are same as given marks.
         */
        return StudData.populateStreamEmployees().stream().filter(employee -> employee.getAge() == Age).findFirst();
    }
}
