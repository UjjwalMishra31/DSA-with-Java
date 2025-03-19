package SpringBootTutorial.AdvanceJava.OptionalsClass;

import java.util.ArrayList;
import java.util.List;

public class StudData
{
    public static List<Student> populateStreamEmployees() {
        List<Student> StudentList = new ArrayList<>();
        StudentList.add(new Student(101, "Ujjwal", 40));
        StudentList.add(new Student(177, "Sneha", 55));
        StudentList.add(new Student(129, "Sudip", 60));
        StudentList.add(new Student(101, "Ujjwal", 60));
        StudentList.add(new Student(153, "Vikas", 44));
        StudentList.add(new Student(102, "Tanishq", 47));
        StudentList.add(new Student(105, "Prema", 35));
        return StudentList;
    }

}
