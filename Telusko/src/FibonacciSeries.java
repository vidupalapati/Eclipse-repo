import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of the series : ");
		int size =sc.nextInt();
		int num1=0,num2=1;
		
		System.out.println(num1);
		System.out.println(num2);
		
		for(int i=2;i<size;i++)
		{
			int num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
			
		}
	}

}
