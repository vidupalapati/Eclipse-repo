package ExceptionHandling;

public class UserDefinedException 
{
	public static void main(String[] args) 
	{
		try
		{
			throw new ManualException("User explicitely throwing an exception");
		}
		catch(ManualException me)
		{
			System.out.println(me);
		}
	}
}
