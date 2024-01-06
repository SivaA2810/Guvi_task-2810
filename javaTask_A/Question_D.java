package javaTask_A;

import java.util.Scanner;

public class Question_D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the first num");
		int num1 = sc.nextInt();
		
		System.out.println("enter the first num");
		int num2 = sc.nextInt();
		
		System.out.println("Before swaping values");
		System.out.println("num1 - "+num1);
		System.out.println("num2 - "+num2);
		
		int temp = num1; //here we create temporary variable and assigned the num1 value in to temporary variable as temp;
		num1=num2;// we swap the num1 value into num2 value
		num2=temp;// here we assigned the temp value into num2 
		

		System.out.println("After swaping values");
		System.out.println("num1 - "+num1);
		System.out.println("num2 - "+num2);
		
		
		
	}

}
