package SRA;
public class KKR
{
	public int player;
	public String captain,city;
	public KKR()
	{
		player=11;
		captain="Shreyas Iyer";
		city="Kolkata";
	}
	public void show()
	{
		System.out.println("Kolkata knight Ridders");
		System.out.println( "Number of Players- "+ player);
		System.out.println("Captain- "+ captain);
		System.out.println("City-" + city);
	}
}