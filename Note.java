import java.util.*;
class Note
{
	int price,no_pages;
	String brandName;
	Scanner sc=new Scanner(System.in);
	void getData()
	{
		System.out.println("Enter Price of Book:");
		price=sc.nextInt();
		System.out.println("Enter Pages number of Book:");
		no_pages=sc.nextInt();
		System.out.println("Enter Brand Name of Book:");
		brandName=sc.nextLine();
	}
	void putData()
	{
		System.out.println(" Price of Book:"+price);
		System.out.println(" Number of Pages of Book:"+ no_pages);
		System.out.println(" Brand Name is " +brandName);
	}
	public static void main(String args[])
	{
		Note ab=new Book();
		ab.getData();
		ab.putData();
	}
		
		
}