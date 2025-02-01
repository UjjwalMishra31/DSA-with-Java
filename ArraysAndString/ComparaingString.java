package ArraysAndString;

public class ComparaingString
{
    public static void main(String[] args) {
        String name = "Ujjwal";
        String lastname = "Mishra";
        if (name == lastname) {
            System.out.println("String are same");
        }
        else {
            System.out.println("Strings are not same");
        }
        String name1 = "Ujjwal";
        String name2 = "ujjwal";
        if (name1.compareTo(name)==0)
        {
            System.out.println("String are same");
        }
        else {
            System.out.println("String are not same");
        }
        if (name2.compareTo(name)==0)
        {
            System.out.println("String are same");
        }
        else {
            System.out.println("String are not same");
        }

    }

}
