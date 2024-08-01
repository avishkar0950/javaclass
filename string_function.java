package avishkar_programs;
import java.io.*;
import java.util.*;
public class string_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		String s2;
		Scanner std=new Scanner(System.in);
		System.out.println("enter the string s1");
		s1=std.nextLine();
		//length
		System.out.println("length of string is"+s1.length());
		System.out.println("enter the string s2");
		s2=std.next();
		System.out.println("compare to function is"+s1.compareTo(s2));
		System.out.println("conactenatuion of string is "+s1.concat("cpomputer"));
		System.out.println("is emptey function is "+s2.isEmpty());
		System.out.println("trim of string is "+s2.trim());
		System.out.println("lowercase is "+s2.toLowerCase());
		System.out.println("uppercase is "+s2.toUpperCase());
		System.out.println("repalce is "+s1.replace('e', 'i'));
	}

}
