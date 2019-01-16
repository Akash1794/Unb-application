package String_log;

public class Swapping_variables {

	public static void main(String[] args) {
		double a,b,temp;
		a=15;
		b=27;
		System.out.println("Before swapping\na="+a+"\nb="+b);
		
		a=a+b;					//temp=a;
		b=a-b;				//a=b;
		a=a-b;				//b=temp;
		System.out.println("after swapping\na="+a+"\nb="+b);
	}

}
