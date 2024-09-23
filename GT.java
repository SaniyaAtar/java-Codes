package SRA;
public class GT
{
	public int player;
	public String captain,city;
	public GT()
	{
		player=11;
		captain="Hardik Pandya";
		city="Gujarat";
	}
	public void show()
	{
		System.out.println("Gujarat Titans");
		System.out.println( "Number of Players- "+ player);
		System.out.println("Captain- "+ captain);
		System.out.println("City-" + city);
	}
}