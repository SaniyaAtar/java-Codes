import java.lang.*;
class Student implements Comparable <Student>
{
	int roll,age;
	String name;
	Student(int roll,int age, String name)
	{
		this.roll=roll;
		this.age=age;
		this.name=name;
	}
	public int compareTo(Student st)
	{
		if (age==st.age)
			return 0;
		else if (age>st.age) 
			return 1;
		else
			return -1;
			
		
	}
}