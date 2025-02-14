package SpringBootTutorial.Tutorial_CoreJava;
record aryacollege(int rollnum , String name , int age) { }
public class recordclass
{
    public static void main(String[] args)
    {
        aryacollege stud1 = new aryacollege(106,"Sudip Ghosh",20);
        aryacollege stud2 = new aryacollege(116,"Ujjwal MIshra",20);
        System.out.println(stud1);
        System.out.println(stud2);
    }
}
