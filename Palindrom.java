import java.util.*;
class Palindrom
{
	public static void main(String[] args) {
			int n,temp,sum=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number ");
			n=sc.nextInt();
			temp=n;
			while(n>0){
				int m=n%10;
				System.out.println(m);
				sum=(sum*10)+m;
				n=n/10;
			}
			if(temp==sum)
				System.out.println("Palindrom");
			else 
				System.out.println("not");



		}	
}