
public class ObjectCounter 
{
	
	public static void main(String[] args) 
	{	
		counter obj1=new counter();
		counter obj2=new counter();
		counter obj3=new counter();
		obj3.show();
	}
}
class counter
{
	static int count=0;
	public counter()
	{
		count++;
	}
	public void show()
	{
		System.out.println(count);
	}
}
