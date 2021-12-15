package Patterns;

public class ReverseHill {

	public static void main(String[] args) 
	{
		int n=6;
		for(int i=1;i<=n;i++)
		{
			//Increasing space
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			//Decreasing star
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			//Decreasing star
			for(int j=i;j<n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
