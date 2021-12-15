package Arrays;

import java.util.Random;

public class RandomClassDemo {

	public static void main(String[] args) 
	{
		//defining an array
				Random ran=new Random();
				int array[]=new int[25];
				for(int i=0;i<array.length;i++)
				{
					array[i]=ran.nextInt(50);
				}
				
				for(int j: array)
				{
					System.out.println(j);
				}
			
	}			
}
