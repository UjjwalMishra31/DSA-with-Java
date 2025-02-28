package SpringBootTutorial.AdvanceJava;

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
}
class studarya
{
    private String name;
    private  String ParentName ;
    private String year;
    public studarya (String name, String ParentName, String year)
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
        System.out.println(" Name : "+stud.getName() + " \n Parent Name : " + stud.getParentName() + " \n Year : "+ stud.getYear());
        studarya stud1 = new studarya("Ujjwal" , "Kamlesh" , "2022");
        System.out.println(" Name : "+stud1.getName() + " \n Parent Name : " + stud1.getParentName() + " \n Year : "+ stud1.getYear());
        StudData<Arya> child = new StudData<>();
        child.addInfo(stud);
        System.out.println("Name: " + child.getInfo().getName() + ", Parent Name: " + child.getInfo().getParentName() + ", Year: " + child.getInfo().getYear());
    }
}
