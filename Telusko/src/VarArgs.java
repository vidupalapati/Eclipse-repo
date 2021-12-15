
public class VarArgs {

	public static void main(String[] args) 
	{
		Display obj = new Display();
		obj.show(5,6,7,8,9);
		obj.show(111);
	}
}
class Display
{
	public void show(int ... a)
	{
		for(int i:a)
		{
			System.out.println(i);
		}
	}
	//it searches for the method with specific parameter first if not found
	// then only searches for the varargs method
	public void show(int b)
	{
		System.out.println(b+" in method show with single argument");
	}
}
