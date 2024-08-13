package avishkar_programs;
import java.io.*;
import java.util.*;
class cube
{
	private double side;
	cube(double side)
	{
		this.side=side;
	}
	public boolean isEqual(cube obj)
	{
		if(this.side==obj.side)
		{
			return true;
			
		}
		else
		{
			return false;
		}
	}
}
public class object_passing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
cube c1=new cube(985);
cube c2=new cube(45);
if(c1.isEqual(c2))
{
	System.out.println("c1==c2");
	}
	}
}
