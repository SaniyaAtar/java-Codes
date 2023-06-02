import java.util.*;
class Politic
{
	String name;
	int no_mls,no_mlc,no_mps;
	Scanner sc=new Scanner(System.in);
	void getData()
	{
		System.out.println("Enter Party Name ");
		name=sc.nextLine();
		System.out.println("Enter Numbers of MLs ");
		no_mls=sc.nextInt();
		System.out.println("Enter number of Mlc ");
		no_mlc=sc.nextInt();
		System.out.println("Enter number of MPs ");
		no_mps=sc.nextInt();
	}
	void display()
	{
		System.out.println("Political Party Name" + name);
		System.out.println("MLS"+ no_mls);
		System.out.println("MLC" + no_mlc);
		System.out.println("MP's" + no_mps);
	}

	public static void main(String args[])
	{
		Politic ab= new Politic();
		//Tennis ac= new Tennis();
		ab.getData();
		ab.display();
		//ac.getData();
		//ac.display();
	}
}
