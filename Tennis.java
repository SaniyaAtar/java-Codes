import java.util.*;
class Tennis
{
	String name,co_name;
	int totalchamp;
	Scanner sc=new Scanner(System.in);
	void getData()
	{
		System.out.println("Enter Player Name ");
		name=sc.nextLine();
		System.out.println("Enter Player Country name ");
		co_name=sc.nextLine();
		System.out.println("Enter number of trophies ");
		totalchamp=sc.nextInt();
	}
	void display()
	{
		System.out.println("Player Name" + name);
		System.out.println("Player Country Name is " +co_name);
		System.out.println("Total champanship " +totalchamp);
	}

	public static void main(String args[])
	{
		Tennis ab= new Tennis();
		Tennis ac= new Tennis();
		ab.getData();
		ab.display();
		ac.getData();
		ac.display();
		if (ab.totalchamp>ac.totalchamp)
			System.out.println("Real Champion is " +ab.name);
		else
			System.out.println("Real Champion is " +ac.name);
		
	}


}
//OUTPUT-->
//Enter Player Name
//saniya
//Enter Player Country name
//india
//Enter number of trophies
//7
//Player Namesaniya
//Player Country Name is india
//Total champanship 7
//Enter Player Name
//P.V.Sindhu
//Enter Player Country name
//india
//Enter number of trophies
//5
//Player NameP.V.Sindhu
//Player Country Name is india
//Total champanship 5
//Real Champion is saniya 
