package avishkar_programs;
import java.io.*;
import java.util.*;
interface print
{
	void disp();
}
class deri implements print
{
	public void disp()
	{
		System.out.println("interface class callled");
	}
}
public class simple_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deri d1=new deri();
		d1.disp();
	}

}
