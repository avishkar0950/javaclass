package avishkar_programs;
import java.io.*;
import java.util.*;
public class two_dem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][]=new int[2][3];
		int arr1[][]=new int[2][3];
		int arr2[][]=new int[2][3];
		int i,j;
		System.out.println("enter the value of array 2 X 3");
		Scanner std=new Scanner(System.in);
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				arr[i][j]=std.nextInt();
			}
		}
		System.out.println("dispaly of array is ");
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	
	System.out.println("enter 2 array element");
	for(i=0;i<2;i++)
	{
		for(j=0;j<3;j++)
		{
			arr1[i][j]=std.nextInt();
		}
	}
	System.out.println("dispaly of array is ");
	for(i=0;i<2;i++)
	{
		for(j=0;j<3;j++)
		{
			System.out.print(arr1[i][j]+"\t");
		}
		System.out.println();
	}
	System.out.println("addition of two arr");
	for(i=0;i<2;i++)
	{
		for(j=0;j<3;j++)
		{
			arr2[i][j]=arr[i][j]+arr1[i][j];
		}
	}
	System.out.println("dispaly of array is ");
	for(i=0;i<2;i++)
	{
		for(j=0;j<3;j++)
		{
			System.out.println(arr2[i][j]);
		}
		System.out.println();
	}
	}

}
