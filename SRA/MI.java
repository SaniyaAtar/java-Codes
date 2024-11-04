package SRA;
public class MI
{
	public int player;
	public String captain,city;
	public MI()
	{
		player=11;
		captain="Rohit Sharma";
		city="Mumbai";
	}
	public void show()
	{
		System.out.println("Mumbai Indians");
		System.out.println( "Number of Players- "+ player);
		System.out.println("Captain- "+ captain);
		System.out.println("City-" + city);
	}
}