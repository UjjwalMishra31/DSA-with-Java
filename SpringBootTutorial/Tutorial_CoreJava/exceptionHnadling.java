package SpringBootTutorial.Tutorial_CoreJava;

public class exceptionHnadling
{
    public static void main(String[] args)
    {
        int m = 10;
        int n = 1;
        String str = null;
        int arr[] = new int[5]; // total length = 5
        try
        {
            System.out.println(str.length());
            int length = arr[5];
            int div = m / n;
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            //System.out.println("Cannot divide by zero");
            System.out.println("Your are going beyond the available limit.");
        }
        catch (Exception ex)
        {
            System.out.println("There an error");
        }
        finally
        {
            System.out.println("Error occured! \nThen also executing guys.");
        }
        int i=0;
        int j=0;
        try
        {
            j=18/i;
            System.out.println("Bye hi");
        }
        catch(Exception e)
        {
            System.out.println("Someting went wrong.");
        }
        // finally is used to execute code after the error line even if an error occurs
        // or in short a code that will always execute even in case of an error
        finally
        {
            System.out.println("Bye");
        }
    }
}
