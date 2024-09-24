package  SRA;
public class CSK
{
	public int player;
	public String captain,city;
	public CSK()
	{
		player=11;
		captain="M.S.Dhoni";
		city="Channai";
	}
	public void show()
	{
		System.out.println("Channai Super King");
		System.out.println( "Number of Players- "+ player);
		System.out.println("Captain- "+ captain);
		System.out.println("City-" + city);
	}
}