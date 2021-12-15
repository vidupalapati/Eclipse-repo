package Constructors;

public class ConstructorOverloading {

	public static void main(String[] args) 
	{
		Const obj = new Const();
		Const obj1=new Const(5);
		Const obj2=new Const(5,8.8);
	}
}
class Const
{
	Const()
	{
		System.out.println("Hello from Default constructor");
	}
	Const(int a)
	{
		System.out.println("Hello from parameterized constructor with value : "+a);
	}
	Const(int a , double d)
	{
		System.out.println("Hello from parameterized constructor with value : "+a+" and "+d);
	}
}
