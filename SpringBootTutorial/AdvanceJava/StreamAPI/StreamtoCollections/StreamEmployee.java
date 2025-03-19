package SpringBootTutorial.AdvanceJava.StreamAPI.StreamtoCollections;

public class StreamEmployee implements Comparable<StreamEmployee>
{

    private  int empID;
    private String name;
    private int age;

    public StreamEmployee(int empID , String name , int age )
    {
        this.empID = empID;
        this.age = age;
        this.name = name;
    }
    public int getEmpid()
    {
        return empID;
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
        return "Employee ID : "+ empID + ", Name : " + name + ", Age : "+age;
    }


    @Override
    public int compareTo(StreamEmployee o) {
        return this.empID - o.getAge();
    }
}
