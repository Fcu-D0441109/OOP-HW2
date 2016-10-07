package ex1;

import java.util.Scanner;

public class StingComparator {
	
	
	public static void main(String[]args)
	{
		
		Scanner ensole = new Scanner(System.in);
		System.out.println("Enter a string1");
		String str1 = ensole.next(); 
		System.out.println("Enter a string2");
		String str2 = ensole.next(); 
		
		if(str1.equalsIgnoreCase(str2))
		{
			
			System.out.println("the two strings are the same");
		}
		else
		{
			System.out.println("the two strings are not the same");
		}
	}
	

}
