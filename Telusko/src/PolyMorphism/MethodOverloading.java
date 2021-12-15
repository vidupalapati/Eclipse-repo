package PolyMorphism;

//Method overloading , Early binding , Static binding , Compiletime polymorphism

public class MethodOverloading {

	public static void main(String[] args) 
	{
		A obj=new A();
		obj.show();
		obj.show(5);
		obj.show(5.5);
	}

}
class A
{
	public void show()
	{
		System.out.println("Hello");
	}
	public void show(int i)
	{
		System.out.println("Hello int"+i);
	}
	public void show(double d)
	{
		System.out.println("Hello double "+d);
	}
}
