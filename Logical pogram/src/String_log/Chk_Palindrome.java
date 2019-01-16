package String_log;

import java.util.Scanner;

public class Chk_Palindrome {

	public static void main(String[] args) {
		
	//by reversing string
		/*
		String str, rev="";		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string=");
		str=scn.nextLine();
		int length = str.length();
		
	//by reversing string	
		for(int i=length-1;i>=0;i--) 
			rev=rev+str.charAt(i);
			
			if(str.equals(rev)) {
				System.out.println(str+ " is Palindrome");
			}
				else {
				System.out.println(str+ " is not Palindrome");
		}
		*/
		
		
	//without reversing string	
		String str;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a String");
		str=scn.nextLine();
		int length = str.length();
		int i,begin,middle,end;
		begin=0;
		end=length-1;
		middle=(begin+end)/2;
		
		for(i=begin;i<=middle;i++) {
			if(str.charAt(begin)==str.charAt(end))
			{
				begin++;
				end--;
			}
			else {
				break;
			}
		}	
			if(i==middle+1) {
				System.out.println("palindrome");
			}
			else
			{
				System.out.println("not a palindrome");
			}
			
		
		
		
	
		
		
		

	}

}
