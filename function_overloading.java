package avishkar_programs;
import java.io.*;
import java.util.*;
class helper
{
	void add(int a,int b)
	{
		System.out.println("addition is "+(a+b));
	}
	void add(int a,int b,int c)
	{
		System.out.println("addition is"+(a+b+c));
	}
	void add(double a,double b)
	{
		System.out.println("addition is"+(a+b));
	}
}

public class function_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		helper h1=new helper();
		int a,b,c;
		double d1,d2;
		Scanner std=new Scanner(System.in);
		System.out.println("enter the 3 integers");
		a=std.nextInt();
		b=std.nextInt();
		c=std.nextInt();
		System.out.println("enter the double int");
		d1=std.nextDouble();
		d2=std.nextDouble();
		h1.add(a, b);
		h1.add(a, b, c);
		h1.add(a, b);
	}

}
