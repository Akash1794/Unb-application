package String_log;

import java.util.Scanner;

public class Factorial_no {

	public static void main(String[] args) {
		/*
		int number=6;
		long fact = 1;
		
		for loop
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println(fact);    */
		
/*		//while loop
		int number=6;
		long fact = 1;
		int i=1;
		while(i<=number) {
			fact=fact*i;
			i++;
		}
		System.out.println(fact);		*/
		
		//using recursion
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no:");
		int num = sc.nextInt();
		int factorial = fact(num);
		System.out.println(factorial);
		}
	static int fact(int n) {
		int output;
		if(n==1) {
			return 1;
		}
		output=fact(n-1)*n;
		return output;
	}

}
