package SpringBootTutorial.AdvanceJava.MultiThreading.SelfPrac;

import java.util.ArrayList;
import java.util.List;

public class AIDS_DEPT implements StudData
{
        private static List<Student> collstud = new ArrayList<>();
        static
        {
            collstud.add(new Student(100, "Ujjwal", "Kamlesh", 21));
            collstud.add(new Student(101, "Prema", "Khetaram", 20));
            collstud.add(new Student(102, "Sudip", "Swaroop", 20));
            collstud.add(new Student(103, "Krishna", "Mahendra", 22));
            collstud.add(new Student(104, "Yash", "Jitendra", 19));
        }
    public void studDataDisplay()
    {
        for (Student stud : collstud)
        {
            System.out.println(stud);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
