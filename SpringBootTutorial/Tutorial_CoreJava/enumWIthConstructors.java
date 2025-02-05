package SpringBootTutorial.Tutorial_CoreJava;
enum Laptop
{
    Asus(45000), Lenovo(49000), Macbook(150000), Dell(51000), Acer;
    private int price;
// for taking all price without error's
    Laptop(int price)
    {
        this.price = price;
    }
// for enum's with no given values, use default values
    Laptop() {
        price = 40000;
    }

    public int getPrice()
    {
        return price;
    }
    public void setPrice()
    {
        this.price = price;
    }
}
public class enumWIthConstructors
{
    public static void main(String[] args)
    {
        Laptop lap = Laptop.Asus;
        System.out.println(lap + " " +lap.getPrice());
        Laptop lap1 = Laptop.Acer;
        System.out.println(lap1+" "+lap1.getPrice());
    }
}
