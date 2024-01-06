package javaTask_A;

public class Question_F {
	
	//Write a program to print the factorial of a given number. For Ex: 51-120
	public static void main(String[] args) {
		int a=5;
		int fact=1;
		while (a>0) {
			fact=fact*a; //1*5=5, 5*4=20, 20*3=60, 60*2=120;
			a=a-1;       //5-1=4, 4-1=3, 3-1=2, 2-1=1;
		}
		System.out.println(fact);
	}
}
