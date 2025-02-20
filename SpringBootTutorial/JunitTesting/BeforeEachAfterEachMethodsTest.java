package SpringBootTutorial.JunitTesting;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BeforeEachAfterEachMethodsTest
{
    BeforeEachAfterEachMethodsTest()
    {
        System.out.println("Hello");
    }
    BeforeEachAfterEachMethods school  = new BeforeEachAfterEachMethods();
    @BeforeAll
    static void beforeAllTestMessage()
    {
        System.out.println("Single Time message before All Tests. (Executing Only Once)");
    }
    @AfterAll
    static void afterAllTestMessage()
    {
        System.out.println("Single Time message After all Tests.  (Executing Only Once)");
    }
    @BeforeEach
    void displayBeforeMessage()
    {
        System.out.println("Checking Grades of the Student");
    }
    @Test
    void FirstCollegegrade()
    {
        SchoolGrades grade = new SchoolGrades();
        assertEquals('A',school.collegegrade(91),"Test case fails!, Try again.");
        System.out.println("Got Grade : A");
    }
    @Test
    void SecondCollegegrade()
    {
        SchoolGrades grade = new SchoolGrades();
        assertEquals('B',school.collegegrade(87));
        System.out.println("Got Grade : B");
    }
    @Test
    void ThirdCollegegrade()
    {
        SchoolGrades grade = new SchoolGrades();
        assertEquals('C',school.collegegrade(79));
        System.out.println("Got Grade : C");
    }
    @AfterEach
    void displayAfterMessage()
    {
        System.out.println("Valuating the Test result with actual result \n");
    }


}