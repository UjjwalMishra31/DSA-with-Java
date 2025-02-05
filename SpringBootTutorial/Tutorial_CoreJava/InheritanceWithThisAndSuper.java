package SpringBootTutorial.Tutorial_CoreJava;
class inherit
{
    class A
    {
        public A()
        {
            System.out.println("In A's Constructor with no n values");
        }
        public A(int n)
        {
            System.out.println("In A's constructor with n value");
        }
    }
    class Bad extends A
    {
        public Bad()
        {
            super();
            System.out.println("In B's Constructor with no n values");
        }
        public Bad(int n)
        {
           // super(n);
            this();
            System.out.println("In B's constructor with n value");
        }
    }
}
public class InheritanceWithThisAndSuper
{
    public static void main(String[] args)
    {
        inherit outer = new inherit(); // First, create an instance of the outer class
        inherit.Bad obj1 = outer.new Bad(); // Create an instance of inner class Bad
        inherit.Bad obj2 = outer.new Bad(10);
    }

}
