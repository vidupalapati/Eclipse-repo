package FileHandling;
import java.io.*;
import java.util.Scanner;
public class ReadFromFile 
{
	public static void main(String[] args) 
	{
		try
		{
			FileReader fr = new FileReader("C:\\Users\\vikas\\Desktop\\JavaFileHandling\\SampleText.txt");
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch(IOException i)	
		{
			System.out.println("Exception Handled");
		}
	}
}
	
	
	
