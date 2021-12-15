package KeyWords;

public class ThisKeyword {

	public static void main(String[] args) 
	{
		AAA obj = new AAA(7);
		obj.show();
	}
}
class AAA
{
	private int x; // instance variable
	 
	AAA(int x) // Local variabe
	{
		// Instance variable=local variable 
		this.x=x; // Current instance 
	}
	public void show()
	{
		System.out.println("X is "+x);
	}
}
