
package avishkar_programs;
import java.io.*;
import java.util.*;
class one 
{
	int a,b;
	 public void input()
	{
		System.out.println("enter the value of a&b");
		Scanner std=new Scanner(System.in);
		a=std.nextInt();
		b=std.nextInt();
	}
}
class two extends one
{
	public void add()
	{
		System.out.println("addition is :"+(a+b));
	}
}
class three extends two
{
	 public void sub()
	{
		System.out.println("sub is :"+(a-b));

	}
}
public class multilvel_inheri {

	public static void main(String[]args)
	{
		three t1=new three();
		t1.input();
		t1.add();
		t1.sub();
	}
}
