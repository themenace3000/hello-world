package firstProject;

import java.util.Scanner;
public class SumIntegers {

	public static void main(String []args)
	{ Scanner input = new Scanner (System.in);
	
	System.out.println("Enter an integer: ");
	int int1 = input.nextInt();
	
	System.out.println("Enter second integer: ");
	int int2 = input.nextInt();
	
	int sum = int1 + int2;
	System.out.println("Sum: " + sum);
	
	}
}
