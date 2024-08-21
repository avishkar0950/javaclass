package avishkar_programs;
import java.io.*;
import java.util.*;
class b
{
	int x,y;
	void set()
	{
		System.out.println("enter the value od x&y");
		Scanner std=new Scanner(System.in);
		x=std.nextInt();
		y=std.nextInt();
	}
}
class d extends b
{
	void evenodd()
	{
		if(x%2==0)
			System.out.println("this number is even"+x);
		else
		System.out.println("this number is odd"+x);
	}
}
class f extends b
{
	void area()
	{
		System.out.println("area of rectangle="+(x*y));
	}
}
class e extends f
{
	void triangle()
	{
		System.out.println("area of triangle"+(1/2*x*y));
	}
}
public class heiarechical
{
public static void main(String[]args)
{
	d d1=new d();
	d1.set();
	d1.evenodd();
	f f1=new f();
	f1.set();
	f1.area();
	e e1=new e();
	e1.set();
	e1.triangle();
}
}
