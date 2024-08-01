package avishkar_programs;
import java.io.*;
import java.util.*;
public class array_user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int arr[]=new int[5];
		System.out.println("enter the arary elemnts");
		Scanner std=new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			arr[i]=std.nextInt();
		}
		System.out.println("the arary elemnts");
		for(i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
