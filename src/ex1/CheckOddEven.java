package ex1;

import java.util.Scanner;

public class CheckOddEven {
	
	public static void main(String[]args)
	{
		
		Scanner enclose = new Scanner(System.in);
		
		System.out.println("Enter a intger:");
		int x = enclose.nextInt();
		
		if(x%2==0)
		{
			System.out.println("the input is even numbet");
		}
		else
		{
			System.out.println("the input is odd numbet");
		}
		
	}

}
