import java.util.*;
class Book
{
	int price,no_pages;
	String brandName;
	Scanner sc=new Scanner(System.in);
	void getData()
	{
		System.out.println("Enter Price of Book:");
		price=sc.next();
		System.out.println("Enter Pages number of Book:");
		no_pages=sc.next();
		System.out.println("Enter Brand Name of Book:");
		brandName=sc.next();
	}
	void putData()
	{
		System.out.println(" Price of Book:"+price);
		System.out.println(" Number of Pages of Book:"+ no_pages);
		System.out.println(" Brand Name is " +brandName);
	}
	public static void main(String args[])
	{
		Book ab=new Book();
		ab.getData();
		ab.putData();
	}
		
		
}