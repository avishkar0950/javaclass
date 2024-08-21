package avishkar_programs;
import java.io.*;
import java.util.*;
interface a1
{
	void inputa();
}
interface b2
{
	void inputb();
}
class add implements a1,b2
{
	int a,b;
Scanner std=new Scanner(System.in);
	public void inputa()
	{
		a=std.nextInt();
	}
	public void inputb()
	{ 
		b=std.nextInt();
		
	}
	void addition()
	{
		System.out.println("addition is "+(a+b));
	}
	
}
public class multiple_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add a1=new add();
		a1.inputa();
		a1.inputb();
		a1.addition();  
	}

}
