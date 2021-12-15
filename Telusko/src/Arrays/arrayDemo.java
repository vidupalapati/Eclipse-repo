package Arrays;

public class arrayDemo {

	public static void main(String[] args) 
	{
		//Arrays in JAVA are objects
		//Syntax to create array <type> <var_name> [] = new <type>[size]
		//defining arrays
		int num[] = new int[3];
		double point[] = new double[3];
		
		//initializing an array
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		//System.out.println(num);// prints the reference as Array in JAVA are objects
		for(int j=0;j<num.length;j++)
		{
			System.out.println(num[j]);
		}
		//OR
		
		char letters[]= {'A','B','C'};
		System.out.println(letters);
		
		// OR using for loop	ashdhsafghkasfgkasf
		for(int i=0;i<3;i++)
		{
			point[i]=i+1 ;
		}
		//System.out.println(point); // prints the reference as Array in JAVA are objects
		for(int j=0;j<point.length;j++)
		{
			System.out.println(point[j]);
		}
	}

}
