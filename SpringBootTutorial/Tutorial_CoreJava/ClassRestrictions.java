package SpringBootTutorial.Tutorial_CoreJava;
// sealed class is used for allowing class to inherit different class
// you allow which class can inherit which class
sealed class student permits college,department {
}
final class college extends student{
}
non-sealed class department extends student
{

}
public class ClassRestrictions
{
    public static void main(String[] args)
    {
        college stud = new college();

    }
}
