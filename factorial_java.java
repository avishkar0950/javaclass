package avishkar_programs;
import java.io.*;
import java.util.Scanner;
class fact
{
	
	/*void input()
	{
		
	}*/
	int logic(int a)
	{ 
		if (a == 0)    
		{
		return 1;
		}	
	  else 
	  {
		  return  (a * logic(a-1));
	  }  
	}		
}
public class factorial_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,i,fact=1;
		fact f1=new fact();
		System.out.println("enter the value of a");
		Scanner std=new Scanner(System.in);
		a=std.nextInt();
		fact=f1.logic(a);
		System.out.println(fact);
	}
}
