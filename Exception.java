import java.util.*;
class Exception
{
	
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		try{
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception Occure");
			
		}
		finally{
			System.out.println("Hello is this finally block");
		}
		
	}
}