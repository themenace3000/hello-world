package firstProject;

import java.util.Scanner;
public class PrintInteger {

	public static void main(String []args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int integer = input.nextInt();
		
		integer = integer + 1;
		System.out.println(integer);
	}
}
