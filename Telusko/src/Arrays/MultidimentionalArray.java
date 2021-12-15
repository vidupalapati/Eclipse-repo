package Arrays;

public class MultidimentionalArray {

	public static void main(String[] args)
	{
		int c[][][]=new int[3][3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for (int k=0;k<3;k++)
				{
					c[i][j][k]=i+j+k;
				}
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for (int k=0;k<3;k++)
				{ 
					System.out.print(c[i][j][k]+" | ");
				}
			}
		}
		
		// Using enhanced for loop
		System.out.println();
		System.out.println("Using enhanced for loop");
		for(int i[][]:c)
		{
			for(int j[]:i)
			{
				for(int k:j)
				{
					System.out.print(k+" | ");
				}
			}
		}
	}
}
