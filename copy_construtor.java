package avishkar_programs;
import java.io.*;
import java.util.*;
class copy_const
{
	int id;
	copy_const(int i1)
	{
		this.id=i1;
	}
	copy_const(copy_const s1)
	{
		id=s1.id;
	}
	void disp()
	{
		System.out.println("id is "+id);
	}
}
public class copy_construtor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copy_const c1=new copy_const(15);
		copy_const c2=new copy_const(c1);
		c2.disp();
	}

}
