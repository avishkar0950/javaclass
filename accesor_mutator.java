package avishkar_programs;
import java.io.*;
import java.util.*;
class stud1
{
	int a,b;
	void seta(int a1)
	{
		this.a=a1;
	}
	void setb(int b1)
	{
		this.b=b1;
		
	}
	int geta()
	{
		return a;
	}
	int getb()
	{
		return b;
	}
}
public class accesor_mutator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
stud1 s1=new stud1();
s1.seta(85);
s1.setb(78);

System.out.println(s1.geta());
System.out.println(s1.getb());
		
	}

}
