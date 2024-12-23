import java.util.*;
class Rectangle{
	int width,height;
	void getData(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height and Width of Rectangle");
		height=sc.nextInt();
		width=sc.nextInt();
	}
	void display(){
		int a;
<<<<<<< HEAD
		a = height*width;
=======
		a=height*width;
>>>>>>> 04e28436a46a7e336660124363d5812d8bbf35f3
		System.out.println("Area of Rectangle is "+ a);
	}
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.getData();
		r.display();
	}
}