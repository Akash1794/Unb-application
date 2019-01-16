package String_log;

import java.util.Scanner;

public class Area {

	
		static Scanner sc=new Scanner(System.in);
	
	//AREA OF CIRCLE	
		/*	public static void main(String[] args) {
			System.out.println("Enter Radius:");
			double rad = sc.nextDouble();
			double area = Math.PI*(rad*rad);
			System.out.println(area);
			double circum = Math.PI*2*rad;
			System.out.println(circum);
	}*/
		
//AREA OF Rectangle	
		/*public static void main(String[] args) {
			System.out.println("Enter length:");
			double length = sc.nextDouble();
			System.out.println("Enter width:");
			double width = sc.nextDouble();
			
			double area=(length*width);
			System.out.println(area);
		}*/
		
		//AREA OF triangle	
				public static void main(String[] args) {
					System.out.println("Enter base:");
					double base = sc.nextDouble();
					System.out.println("Enter height:");
					double height= sc.nextDouble();
					
					double area=(base*height)/2;
					System.out.println(area);
				}

}
