package Arrays;

public class EnhancedForLoop {

	public static void main(String[] args) 
	{
		//defining an array
		int num[]=new int[5];
		
		//initializing the array
		for(int i=0;i<5;i++)
		{
			num[i]=i+1;
		}
		
		//printing the array elements using enhanced for loop
		for(int j :num)
		{
			System.out.println(j);
		}
	}

}
