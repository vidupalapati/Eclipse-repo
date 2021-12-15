
public class SwitchCase {

	public static void main(String[] args) 
	{
		int i=7;
				
		
		switch(i)
		{
			case 0:
				System.out.println("Zero");
				break;
				
			case 1:
				System.out.println("one");
				break;
				
			case 7:
				System.out.println("seven");
				break;
			
			case 9:
				System.out.println("nine");
				break;
		}
		
		// JAVA switch supports STRINGS
		
		String str ="Hi";
		
		switch(str)
		{
			case "Hi":
				System.out.println("Hi");
				break;
				
			case "Hello":
				System.out.println("Hello");
				break;
		}
	}

}
