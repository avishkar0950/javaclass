package avishkar_programs;
import java.io.*;
import java.util.*;
public class stringbuffre_func {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="shree computer";
		
StringBuffer str1=new StringBuffer(str);
System.out.println("length of string is "+str1.length());
System.out.println("capacity of string is "+str1.capacity());
System.out.println("append is "+str1.append(" eduaction"));
	}

}
