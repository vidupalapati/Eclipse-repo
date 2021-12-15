package Patterns;

public class RightTriangle {

	public static void main(String[] args) 
	{
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			// for loop for decreasing triangle space
			for(int j=i;j<=n;j++)
			{
				System.out.print("  ");
			}
			// for loop for increasing triangle star
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
