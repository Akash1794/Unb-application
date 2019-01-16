package String_log;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter integer:");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		if(num%2==0)
			System.out.println("even no");
		else
			System.out.println("odd no");

	}

}
