package avishkar_programs;
import java.io.*;
import java.util.*;
class base
{
	int a,b;
	void input()
	{
		System.out.println("enter the value of a and b");
		Scanner std=new Scanner(System.in);
		a=std.nextInt();
		b=std.nextInt();
	}
}
class derived extends base
{
	void add()
	{
		System.out.println(a+b);
	}
}
public class single_inhreitance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		derived d1=new derived();
		d1.input();
		d1.add();
	}

}
