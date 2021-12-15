package Inheritance;

public class SingleLevel 
{
	public static void main(String[] args) 
	{
		additionSubstraction obj = new additionSubstraction();
		System.out.println(obj.add(5,4));
		System.out.println(obj.sub(5,4));
	}
}
class addition
{
	int result;
	public int add(int num1,int num2)
	{
		result = num1+num2;
		return result;
	}
}
class additionSubstraction extends addition // Single Level INheritance
{
	public int sub(int num1,int num2)
	{
		result=num1-num2;
		return result ;
	}
}