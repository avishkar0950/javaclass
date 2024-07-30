package avishkarjava;

import java.util.Scanner;

public class array_userdefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int i;
             int arr[]=new int[5];
             System.out.println("enter the array element");
             Scanner std=new Scanner(System.in);
             for(i=0;i<5;i++)
             {
            	 arr[i]=std.nextInt();
             }
             System.out.println("array element");
             for(i=0;i<5;i++)
             {
            	 System.out.println(arr[i]);
             }
	}

}
