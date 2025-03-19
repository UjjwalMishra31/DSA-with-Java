package SpringBootTutorial.AdvanceJava.OptionalsClass;


public class Student implements Comparable<Student>
{

    private  int stdID;
    private String name;
    private int age;

    public Student()
    {
        this.stdID = 100;
        this.name = "Legend";
        this.age = 40;
    }

    public Student(int stdID , String name , int age )
    {
        this.stdID = stdID;
        this.age = age;
        this.name = name;
    }
    public int getStdId()
    {
        return stdID;
    }
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    @Override
    public String toString() {
        return "Student ID : "+ stdID + ", Name : " + name + ", Age : "+age;
    }



    @Override
    public int compareTo(Student o) {
        return this.stdID - o.getStdId();
    }
}
