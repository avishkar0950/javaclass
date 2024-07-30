package avishkarjava;
import java.util.*;
public class relational_operator {

   public static void main(String[]args)
   {
	   int a,b;
	   System.out.println("enter the value of a&b");
	   Scanner std=new Scanner(System.in);
	   a=std.nextInt();
	   b=std.nextInt();
	   System.out.println("generate the relational operator");
	   System.out.println(a==b);
	   System.out.println(a!=b);
	   System.out.println(a<b);
	   System.out.println(a>b);
	   System.out.println(a>=b);
	   System.out.println(a<=b);
   }
}
