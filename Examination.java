import java.util.*;
class Examination
{
	int year,tsa;
	Scanner sc=new Scanner(System.in);
	void getData()
	{
		System.out.println("Enter year");
		year=sc.nextInt();
		System.out.println("Enter number of student appeared");
		tsa=sc.nextInt();
	}
	void saniya()
	{
		System.out.println("Year of student"+ year);
		System.out.println("Total number of student Apeared examination"+ tsa);
	}
	public static void main(String args[])
	{
		Examination san=new Examination();
		Examination sra=new Examination();
		Examination sanu=new Examination();
		san.getData();
		sra.getData();
		sanu.getData();
		san.saniya();
		sanu.saniya();
		sra.saniya();
		if (san.tsa>sra.tsa&&san.tsa>sanu.tsa)
			System.out.println("largest student appear in examination is" + san.year);
		else if(sra.tsa>san.tsa&&sra.tsa>sanu.tsa)
			System.out.println("largest student appear in examination is" + sra.year);
		else
			System.out.println("largest student appear in examination is" + sanu.year);
	}
}
/*Enter year
2012
Enter number of student appeared
1200
Enter year
2013
Enter number of student appeared
2000
Enter year
2014
Enter number of student appeared
1800
Year of student2012
Total number of student Apeared examination1200
Year of student2014
Total number of student Apeared examination1800
Year of student2013
Total number of student Apeared examination2000
largest student appear in examination is 2013*/
		
		
		