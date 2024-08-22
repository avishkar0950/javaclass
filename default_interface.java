package avishkar_programs;
import java.io.*;
import java.util.*;
interface def
{
	void set();
	default void set1()
	{
		System.out.println("default interface");
	}
}
class tree implements def
{
	public void set()
	{
		System.out.println("default method");
	}
}
public class default_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
tree t1=new tree();
t1.set();
t1.set1();

	}

}
