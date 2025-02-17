package SpringBootTutorial.JunitTesting;

//use this for Junit4
//import org.junit.Test;

//use this for Junit5
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SchoolGradesTest
{
    @Test
    void Firstgrade()
    {
        SchoolGrades grade = new SchoolGrades();
        assertEquals('A',grade.grade(91),"Test case fails!, Try again.");
    }
    @Test
    void Secondgrade()
    {
        SchoolGrades grade = new SchoolGrades();
        assertEquals('B',grade.grade(87));
    }
    @Test
    void Thirdgrade()
    {
        SchoolGrades grade = new SchoolGrades();
        assertEquals('C',grade.grade(79));
    }
}