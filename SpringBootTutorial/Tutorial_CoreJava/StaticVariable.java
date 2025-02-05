package SpringBootTutorial.Tutorial_CoreJava;
class StudentCollegeArya
{
    int Roll_No;
    String Name;
    int Marks;
    static String collegename = "Arya" ;
}
public class StaticVariable {
    public static void main(String[] args) {
        StudentCollegeArya s1 = new StudentCollegeArya();
        s1.Roll_No = 01;
        s1.Name = "Ujjwal Mishra";
        s1.Marks = 89;
        //StudentCollegeArya.collegename = "Arya College Of Engineering";
        StudentCollegeArya s2 = new StudentCollegeArya();
        s2.Roll_No = 02;
        s2.Name = "Sudip Ghosh";
        s2.Marks = 56;
        //StudentCollegeArya.collegename = "Arya";
        StudentCollegeArya s3 = new StudentCollegeArya();
        s3.Roll_No = 3;
        s3.Name = "Vikas Kumar Kumawat";
        s3.Marks = 79;
        //StudentCollegeArya.collegename = "Arya";
        StudentCollegeArya s4 = new StudentCollegeArya();
        s4.Roll_No = 04;
        s4.Name = "Vikas Bohra";
        s4.Marks = 85;
       // StudentCollegeArya.collegename = "Arya";
        StudentCollegeArya s5 = new StudentCollegeArya();
        s5.Roll_No = 05;
        s5.Name = "Tanishq Panchal";
        s5.Marks = 81;
        //StudentCollegeArya.collegename = "Arya College Legends";
        StudentCollegeArya studarray[] = new StudentCollegeArya[5];
        studarray[0] = s1;
        studarray[1] = s2;
        studarray[2] = s3;
        studarray[3] = s4;
        studarray[4] = s5;
        // Advance for loop
        for (StudentCollegeArya stud : studarray) {
            System.out.println(stud.Roll_No + " : " + stud.Name + " : " + stud.Marks + " : " + StudentCollegeArya.collegename);
        }
    }
}