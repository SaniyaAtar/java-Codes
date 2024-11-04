import java.lang.*;
import java.util.*;
class TestComparable
{
	public static void main(String[] args) {
		ArrayList <Student> al=new ArrayList<Student>();
		Student s1=new Student(1,20,"Saniya");
		Student s2=new Student(2,21,"Sofiya");
		Student s3=new Student(3,20,"Aliya");
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Collections.sort(al);
		for(Student i:al)
			System.out.println(i.name+" "+i.roll+""+i.age);
	}
}