package avishkarjava;

import java.util.Scanner;

public class assignment_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                int a,b;
                System.out.println("enter the value of a&b");
                Scanner std=new Scanner(System.in);
                a=std.nextInt();
                b=std.nextInt();
                System.out.println(a=b);
                System.out.println(b+=a);
                System.out.println(b-=a);
                System.out.println(b*=a);
                System.out.println(b/=a);
	}

}
