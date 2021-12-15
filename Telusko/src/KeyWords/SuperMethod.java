package KeyWords;

public class SuperMethod {

	public static void main(String[] args) 
	{
		B obj = new B();
		B obj1 = new B(6);
	}
}
class A
{
	A()
	{
		System.out.println("In const A");
	}
	A(int i)
	{
		System.out.println("In const A and parmateter "+i);
	}
}
class B extends A
{
	B()
	{
		System.out.println("In const B");
	}
	B(int i)
	{
		System.out.println("In const B and parmateter "+i);
	}
}