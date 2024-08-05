package avishkar_programs;
import java.io.*;
import java.util.*;
class stud
{
	int a,b;
	void input()
	{
		System.out.println("enter the value of a&b");
		Scanner std=new Scanner(System.in);
		a=std.nextInt();
		b=std.nextInt();
	}
	void mul()
	{
		System.out.println("multiplication is"+(a*b));
	}
}
public class oops_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
stud s1=new stud();
s1.input();
s1.mul();
	}

}
