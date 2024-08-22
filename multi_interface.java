package avishkar_programs;
import java.io.*;
import java.util.*;
interface ring
{
	void print();
}
interface raound extends ring
{
	void show();
}
class row implements raound
{
	public void print()
	{
		System.out.println("base class");
	}
	public void show()
	{
		System.out.println("derive class");
	}
}
public class multi_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       row r1=new row();
       r1.print();
       r1.show();
	}

}
