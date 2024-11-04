import java.util.*;
interface Area
{
	final static float PI=3.14f;
	float compute(float x,float y);
}
class Rectangle implements Area
{
	public float compute(float x,float y)
	{
		return x*y;
	}
}
class Circle implements Area{
	public float compute(float x,float y){
		return (PI*x*y);
	}
}
class Interface
{
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		Area a;
		a=r;
		System.out.println("Area of Reactangle = "+ a.compute(10,20));
		a=c;
		System.out.println("Area of Circle = "+ a.compute(10,10));
	}
}