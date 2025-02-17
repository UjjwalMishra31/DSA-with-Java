package SpringBootTutorial.JunitTesting;
import org.junit.jupiter.api.Test;

public class SchoolGrades
{
    public char grade(int gradeper)
    {
        if (gradeper > 90) {
            return 'A';
        }
        else if (gradeper > 80) {
            return 'B';
        }
        else if (gradeper > 70) {
            return 'C';
        }
        else if (gradeper > 60) {
            return 'D';
        }
        else if (gradeper > 50 ) {
            return 'E';
        }
        else {
            return 'F';
        }

    }
}
