package SpringBootTutorial.AdvanceJava.Generics;

class Arya
{
    private String name;
    private  String ParentName ;
    private String year;
    public Arya(String name, String ParentName, String year)
    {
        this.name = name;
        this.ParentName = ParentName;
        this.year = year;
    }
    public String getName()
    {
        return name;
    }
    public String getParentName()
    {
        return ParentName;
    }
    public String getYear()
    {
        return year;
    }

    @Override
    public String toString() {
        return name+", "+ParentName+", "+year;
    }
}
class studdept
{
    private String name;
    private  String ParentName ;
    private int year;
    public studdept(String name, String ParentName, int year)
    {
        this.name = name;
        this.ParentName = ParentName;
        this.year = year;
    }
    public String getName()
    {
        return name;
    }
    public String getParentName()
    {
        return ParentName;
    }
    public int getYear()
    {
        return year;
    }

    @Override
    public String toString() {
        return name+ ", "+ParentName+", "+year;
    }
}
class StudData<T>
{
    private T info;

    public void addInfo(T info)
    {
        this.info = info;
    }
    public T getInfo()
    {
        return info;
    }

}


public class GenericsPracticeQuestion
{
    public static void main(String[] args)
    {
        Arya stud = new Arya("Ujjwal" , "Kamlesh" , "2022");
        studdept studstud1 = new studdept("Ujjwal" , "Kamlesh" , 2022);
        System.out.println(" Name : "+stud.getName() + " \n Parent Name : " + stud.getParentName() + " \n Year : "+ stud.getYear());
        System.out.println(" Name : "+ studstud1.getName() + " \n Parent Name : " + studstud1.getParentName() + " \n Year : "+ studstud1.getYear());
        StudData<Arya> child = new StudData<>();
        StudData<studdept> department = new StudData<>();
        child.addInfo(stud);
        department.addInfo(studstud1);
        System.out.println("Name: " + child.getInfo().getName() + ", Parent Name: " + child.getInfo().getParentName() + ", Year: " + child.getInfo().getYear());
        System.out.println("Data Stored In department : "+department.getInfo());
    }
}
