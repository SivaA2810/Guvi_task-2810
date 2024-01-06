package javaTask_A;

import java.util.Iterator;

public class Question_E {
//Write a program to check if a number is prime or not.
	public static void main(String[] args) {
		
		int n = 17;
		int count =0;
		for (int i = 2; i <n/2 ; i++) {
			if(n%2==0) {
				count++;
			}
		}
		if(count==0){
			System.out.println("given numer is prime ");
		}
		else {System.out.println("given numer is not prime");}

	}

}
