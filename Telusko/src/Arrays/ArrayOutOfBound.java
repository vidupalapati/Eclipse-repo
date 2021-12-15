package Arrays;

public class ArrayOutOfBound {

	public static void main(String[] args) 
	{
		int array[] = new int[10];
		try
		{
			System.out.println(array[15]);// throws error as index is out of bound
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println(" max array index is : "+(array.length-1));
		}
	}

}
