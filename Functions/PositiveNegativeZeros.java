package Functions;

import java.util.Scanner;

public class PositiveNegativeZeros
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int negative = 0;
        int positive = 0;
        int zeros = 0;
        do {
            System.out.println("Enter any number : ");
            int n = sc.nextInt();
            if (n>0){
                positive++;
            } else if (n<0) {
                negative++;
            }else {
                zeros++;
            }


        }while (positive<=5 || negative<=5 || zeros<=5);
        System.out.println("Positive : "+positive + " Negative : "+negative + " Zeroes : "+zeros);
    }
//    public static void main(String[] args) {
//        //Scanner sc = new Scanner(System.in);
//        validate();
//    }
}
