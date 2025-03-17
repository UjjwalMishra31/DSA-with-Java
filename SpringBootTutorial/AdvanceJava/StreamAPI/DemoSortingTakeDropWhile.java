package SpringBootTutorial.AdvanceJava.StreamAPI;

import java.util.List;

public class DemoSortingTakeDropWhile {
    public static void main(String[] args) {
        List<NewEmployee> demolist = EmployeeData2.populateStreamEmployees();
        demolist.forEach(System.out::println);

        /*
        filtering techniques : drop and take while
            sorting with
            drop while
            and
            take while
                     */
        System.out.println();
        System.out.println("Sorting with Filtering");
        demolist.stream()
                .sorted(((o1, o2) -> o1.getAge() - o2.getAge()))
                .filter(employee -> employee.getAge() >= 45)
                .forEach(System.out::println);
        System.out.println();
        System.out.println("--- Sorting With Take while ---");
        demolist.stream()
                .sorted((o1, o2) -> o1.getAge() - o2.getAge())
                .takeWhile(emp -> emp.getAge() < 45)
                .forEach(System.out::println);
        System.out.println();
        System.out.println("--- Sorting With Drop While ---");
        demolist.stream()
                .sorted(((o1, o2) -> o1.getAge()- o2.getAge()))
                .dropWhile(emp -> emp.getAge() <= 45)
                .forEach(System.out::println);

    }
}