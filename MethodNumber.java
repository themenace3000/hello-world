package Homework3;

import java.util.Scanner;

public class MethodNumber
{
	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		
		if(number > 0)
		{
			System.out.println("The number you entered is positive");
		}
		
		if(number < 0)
		{
			System.out.println("The number you entered is negative");
		}
	}
}