package SpringBootTutorial.Tutorial_CoreJava;
/* if you declare variable in interface then it is by
default set final , for example check the below design interface
 */
interface design
{
    int price = 20000;
   // price = 10000;
    // both methods are abstract class but we are not required to use abstract keyword
    public void motorola();
    void motoRazr();
}
interface brand extends design
{
    public void brand();
}
class moto implements brand
{
    public void motorola()
    {
        System.out.println("hii! Welcome to razr family"+price);
    }

    public void motoRazr()
    {
        System.out.println("hii! Welcome to Motorola Family");
    }
    public void brand()
    {
        System.out.println("Working on making Motorola a Brand");
    }
}
public class InterfaceswithClass
{
    public static void main(String[] args)
    {
        moto phone = new moto();
        phone.motorola();
        phone.motoRazr();
        phone.brand();
    }
}
