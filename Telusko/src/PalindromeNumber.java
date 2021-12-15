import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num =sc.nextInt();
		int actual_number =num;
		int rem,rev_num=0;
		
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev_num=rev_num*10+rem;
		}
		
		if (actual_number == rev_num)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}

}
