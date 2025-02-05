package SpringBootTutorial.Tutorial_CoreJava;
class outerClass
{
    public void outerdata()
    {
        System.out.println("Outer class here !");
    }
    class innerClass
    {
        public void innerdata()
        {
            System.out.println("Inner Class here !");
        }
    }
}
public class ClassInsideClass
{
    public static void main(String[] args)
    {
        outerClass obj = new outerClass(); // calling outerclass
        // now we can call outer call objects but not class inside class
        obj.outerdata();
        // obj.innerdata(); { class inside class }
        // for calling inner class
        outerClass.innerClass obj1 = obj.new innerClass();
        obj1.innerdata();
    }
}
