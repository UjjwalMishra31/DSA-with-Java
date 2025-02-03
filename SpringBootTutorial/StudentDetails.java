package SpringBootTutorial;
class StudentCollege
{
    int Roll_No;
    String Name;
    int Marks;
}

public class StudentDetails {
    public static void main(String[] args) {
        StudentCollege s1 = new StudentCollege();
        s1.Roll_No = 01;
        s1.Name = "Ujjwal Mishra";
        s1.Marks  = 89;
        StudentCollege s2 = new StudentCollege();
        s2.Roll_No = 02;
        s2.Name = "Sudip Ghosh";
        s2.Marks  = 56;
        StudentCollege s3 = new StudentCollege();
        s3.Roll_No = 03;
        s3.Name = "Vikas Kumar Kumawat";
        s3.Marks  = 79;
        StudentCollege s4 = new StudentCollege();
        s4.Roll_No = 04;
        s4.Name = "Vikas Bohra";
        s4.Marks  = 85;
        StudentCollege s5 = new StudentCollege();
        s5.Roll_No = 05;
        s5.Name = "Tanishq Panchal";
        s5.Marks  = 81;
        StudentCollege studarray[] = new StudentCollege[5];
        studarray[0]= s1;
        studarray[1]= s2;
        studarray[2]= s3;
        studarray[3]= s4;
        studarray[4]= s5;
        // Advance for loop
        for (StudentCollege stud : studarray)
        {
            System.out.println(stud.Roll_No+" : "+stud.Name+ " : "+ stud.Marks);
        }
    }
}
