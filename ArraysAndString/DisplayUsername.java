package ArraysAndString;

import java.util.Scanner;

public class DisplayUsername
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your mail id : ");
        String mail = sc.next();
        String username = " ";
        for (int i = 0; i<mail.length(); i++)
        {
            if (mail.charAt(i)== '@')
            {
                break;
            }
            else {
                username = username + mail.charAt(i) ;
            }
        }
        System.out.println("Hii ! : "+username);
    }
}
