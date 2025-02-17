package SpringBootTutorial.JunitTesting;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SchoolGradesTest
{
    @Test
    public void Firstgrade()
    {
        SchoolGrades grade = new SchoolGrades();
        assertEquals('A',grade.grade(92));
    }
    @Test
    public void Secondgrade()
    {
        SchoolGrades grade = new SchoolGrades();
        assertEquals('B',grade.grade(87));
    }
    @Test
    public void Thirdgrade()
    {
        SchoolGrades grade = new SchoolGrades();
        assertTrue(grade.grade(79)=='C');
    }
}