package PolyMorphism;

public class MethodOverRiding 
{
	public static void main(String[] args) 
	{
		B obj = new B();
		obj.show();
	}
}
class A1 
{
	public void show()
	{
		System.out.println("In show of class A");
	}
}
class B extends A1
{
	public void show()
	{
		System.out.println("In show of class B");
	}
}