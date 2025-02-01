package ArraysAndString;

import java.util.Scanner;

public class ReplaceCharStrings
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string name : ");
        String userinput = sc.next();
        StringBuilder user = new StringBuilder(userinput);
        int size = user.length();
        String result = " ";
        for (int i = 0 ; i<userinput.length(); i++)
        {
            if (userinput.charAt(i)=='e')
            {
                result = result + 'i';
            }
            else {
                result = result + userinput.charAt(i);
            }
        }
        System.out.println("RESULT "+result);
        for (int i = 0 ; i<size; i++)
        {
            if (user.charAt(i)=='e')
            {
                user.setCharAt(i,'i');
            }
        }
        System.out.println("USER "+user);
    }
}
