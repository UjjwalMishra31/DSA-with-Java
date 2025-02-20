package SpringBootTutorial.JunitTesting;

public class BeforeEachAfterEachMethods
{
    // @BeforeEach : method will execute before all the test cases
    // @AfterEach : method will get executed after all test cases

    /*
    Lets take example of grades for understanding BeforeEach and AfterEach method
     */
    public char collegegrade(int gradepercent)
    {
        if (gradepercent > 90) {
            return 'A';
        }
        else if (gradepercent > 80) {
            return 'B';
        }
        else if (gradepercent > 70) {
            return 'C';
        }
        else if (gradepercent > 60) {
            return 'D';
        }
        else if (gradepercent > 50 ) {
            return 'E';
        }
        else {
            return 'F';
        }

    }
}
