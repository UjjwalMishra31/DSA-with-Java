package SpringBootTutorial.AdvanceJava.OptionalsClass;

import java.util.List;

public class Demo1 {

    public static void main(String[] args) {
        System.out.println(fetchStudByMarks(60));
        System.out.println(fetchStudByMarks(66));
    }

    public static Student fetchStudByMarks(int marks) {

        List<Student> employeeList = StudData.populateStreamEmployees();
        for (Student employee : employeeList) {
            if (employee.getAge() == marks)
                return employee;
        }
        return null;
    }
}