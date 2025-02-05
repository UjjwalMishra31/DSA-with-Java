package SpringBootTutorial;
// anonymous class : creating class outside main class but modifing it inside main class
class anonymous
{
    public void newclass()
    {
        System.out.println("hello !");
    }
}
public class AnonymousClass
{
    public static void main(String[] args)
    {
        anonymous obj = new anonymous()
        {
            public void newclass()
            {
                System.out.println("Hello, Anonymous class");
            }
        };
        obj.newclass();
    }
}
