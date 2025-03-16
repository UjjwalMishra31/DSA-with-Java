package SpringBootTutorial.AdvanceJava.StreamAPI;

public class NewEmployee
{

    private int empID;
    private String name;
    private int age;

    public NewEmployee(int empID , String name , int age )
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
}
