package ArraysAndString;

public class concatination
{
    public static void main(String[] args) {
        String name = "Ujjwal";
        String lastname = "Mishra";
        String fullName = name + " " +lastname;
        System.out.println("Your name is "+fullName);
        // Length
        System.out.println(fullName.length());
        // charAt
        System.out.println(fullName.charAt(5));
        // subs+string
        System.out.println(fullName.substring(3,10));
    }
}
