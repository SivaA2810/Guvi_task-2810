package javaTask_A;

public class Question_I {
	
	// Write a program to Count Number of Digits in an Integer
public static void main(String[] args) {
	
	int num =1234567;
	int count=0;
	while(num>0) {
		
		count++; 
		num = num/10; 
	}
	System.out.println(count);
}
}
