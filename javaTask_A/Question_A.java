package javaTask_A;


public class Question_A {
	//1. Write a Java program that declares four integer variables:
	//a, b, c, and d. Then, write an if statement that checks whether the sum of a and b is greater than the sum of c and d. 
	//If the condition is true, the program should output a message indicating that the sum of a and b is greater than the sum of c and d.
	

public static void main(String[] args) {
	
	int a =40;
	int b =30;
	int c=20;
	int d=60;
	
	int ab =(a+b);
	int bc =(b+c);
	if(ab>bc) {
		System.out.println("the sum of a and b is greater than the sum of c and d");
	}
	else {
		System.out.println("the given statement is fail");
	}
	
}
}
