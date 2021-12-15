package FileHandling;
import java.io.*;
import java.util.Scanner;
public class ScannerClass 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		File f = new File("C:\\Users\\vikas\\Desktop\\JavaFileHandling\\SampleText.txt");
		File dest = new File("C:\\Users\\vikas\\Desktop\\JavaFileHandling\\SampleTextRenamed.txt");
		Scanner sc = new Scanner(f);
		while(sc.hasNext())
		{
			String str = sc.next();
			String str1[] = str.split(",");
			for(String j:str1)
			{
			System.out.println(j);
			}
			
		}
	}
}
