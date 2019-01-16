package String_log;

import java.util.Scanner;

public class Floyd_Triangle {
 
	public static void main(String[] args) {
		int rows,number=1,counter,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows:");
		rows=sc.nextInt();
		
		for(counter=1;counter<=rows;counter++)
		{
			for(j=1;j<=counter;j++) {
				System.out.print(number+"");
				number++;
			}
			System.out.println();
		}	
		}
	}

