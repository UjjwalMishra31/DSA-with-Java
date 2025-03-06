package SpringBootTutorial.AdvanceJava.MultiThreading.SelfPrac;

public class Student
{
    private int Roll_No;
    private String Name;
    private String FathName;
    private int Age;
    public Student(int Roll_No , String Name , String FathName , int Age)
    {
        this.Roll_No = Roll_No;
        this.Name = Name;
        this.FathName = FathName;
        this.Age = Age;
    }
    public int getRoll_No() {
        return Roll_No;
    }

    public void setRoll_No(int roll_No) {
        Roll_No = roll_No;
    }
    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
    public String getFathName() {
        return FathName;
    }

    public void setFathName(String fathName) {
        FathName = fathName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    @Override
    public String toString()
    {
        return "Student [ Roll No. : "+Roll_No+", Name : "+Name+ ", Father's Name : "+FathName+", Age : "+Age+" ]";
    }
}
