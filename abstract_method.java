package avishkar_programs;
import java.io.*;
import java.util.*;
abstract class abst
{
	abstract void disp();
}
class myclass extends abst
{
	 void disp()
	{
		System.out.println("example of abstract class");
	}
};
public class abstract_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abst a1=new myclass();
		a1.disp();
	}

}
