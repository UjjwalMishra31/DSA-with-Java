package SpringBootTutorial.MethodReference;

public class Employee
{
    private int empid;
    private String name;
    private int age;

    public Employee(int empid , String name , int age )
    {
        this.empid = empid;
        this.age = age;
        this.name = name;
    }
    public int getEmpid()
    {
        return empid;
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
        return "Employee ID : "+ empid + ", Name : " + name + ", Age : "+age;
    }
}
