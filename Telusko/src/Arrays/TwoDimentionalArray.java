package Arrays;

public class TwoDimentionalArray {

	public static void main(String[] args) 
	{
		int Array[][] = new int[5][5];
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				Array[i][j]=i;
			}
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(Array[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("using enhanced for loop");
		for (int i[]:Array)
		{
			for(int j :i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
