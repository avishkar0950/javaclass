package avishkar_programs;
class Parent
{
	void display()
	{
		System.out.println("Parent class");
	}
}
class Child extends Parent
{
	void display()
	{
		System.out.println("Child class");
	}
}


public class method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p;
		p=new Parent();
		p.display();
		p=new Child();
		p.display();
	}

}
