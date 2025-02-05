package SpringBootTutorial;
abstract class newanonymous
{
    public abstract void arya();
    public abstract void developers();
}

public class AnonymousClassWithAbstractClass
{
    public static void main(String[] args)
    {
        newanonymous obj = new newanonymous() {
            public void arya()
            {
                System.out.println("Hello! Arya");
            }

            public void developers()
            {
                System.out.println("Hello! Developers");
            }
        };
        obj.arya();
        obj.developers();
    }
}
