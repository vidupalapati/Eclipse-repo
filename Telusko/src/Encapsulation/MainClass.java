package Encapsulation;

public class MainClass 
{
	public static void main(String[] args) 
	{
		A obj = new A();
		obj.setI(555);
		System.out.println(obj.getI());
	}
}
class A
{
	private int i ;
	public void setI(int j)
	{
		i=j;
	}
	public int getI()
	{
		return i;
	}
}