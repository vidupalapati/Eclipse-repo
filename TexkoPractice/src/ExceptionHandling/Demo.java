package ExceptionHandling;

public class Demo 
{
	public static void main(String[] args) 
	{
		try 
		{
			int i=0,res=0;
			res= 5/i;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException is caught");
		}
		try
		{
			int a[] = {0,1,2,3,4};
			System.out.println(a[7]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array index is out of bound ");
		}
		finally
		{
			System.out.println("Finally block is executed irrespective of eceptions");
		}
	}
}
