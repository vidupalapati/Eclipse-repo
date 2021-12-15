package FileHandling;
import java.io.*;
import java.util.Scanner;
public class ScannerRead 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File file = new File("./textfile.txt");
		
		Scanner scan = new Scanner(file);
		while(scan.hasNext())
		{
			System.out.println(scan.nextLine());
		}
	
	}
}
