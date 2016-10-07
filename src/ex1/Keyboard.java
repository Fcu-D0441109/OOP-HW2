	package ex1;

import java.util.Scanner;	

public class Keyboard {
	
	public static void main (String[] args)
	{

	Scanner Keyboard = new Scanner(System.in);
	System.out.println("Enter a intger");
	
	int x = Keyboard.nextInt();
	System.out.println("Enter a point number");
	double y = Keyboard.nextDouble();
	System.out.println("Enter your name");
	String name = Keyboard.next() ;
	
	System.out.printf("Hi %s,the multiplication of %d and %f is%e",name,x,y,x+y);
	}

}
