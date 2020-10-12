package Homework3;
import java.util.Scanner;

public class ThreeNumbers
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 1st number: ");
        int num1 = input.nextInt();
        
        System.out.println("Enter 2nd number: ");
        int num2 = input.nextInt();
        
        System.out.println("Enter 3rd number");
        int num3 = input.nextInt();
        
        if(num1 > num2 && num1 > num3)
        {
            System.out.println("The greatest number is " + num1);
        }
        
        if(num2 > num1 && num2 > num3)
        {
            System.out.println("The greatest number is " + num2);
        }
        
        if(num3 > num1 && num3 > num2)
        {
            System.out.println("The greatest number is " + num3);
        }
    }
}