package avishkar_programs;
import java.io.*;
import java.util.*;
class para
{
	int a,b;
		 para(int a1,int b1)
		 {
			 a=a1;
			 b=b1;
		 }
void display()
{
	System.out.println("addition is "+(a+b));
}
	
}
public class parameterised_cons {

	public static void main(String[]args)
	{   int a,b;
		
	System.out.println("enter the value of a&b");
	Scanner std=new Scanner(System.in);
	a=std.nextInt();
	b=std.nextInt();
	para s1=new para(a,b);
		s1.display();
	}
}
