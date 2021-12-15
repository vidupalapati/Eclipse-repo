package FileHandling;

import java.io.*;

public class CreateFile {

	public static void main(String[] args) throws IOException
	{
		File f = new File("C:\\Users\\vikas\\Desktop\\JavaFileHandling\\SampleText.txt");
		
		if(f.createNewFile())
		{
			System.out.println("File successfully created...");
		}
		else
		{
			System.out.println("File already exists...");	
		}
	}
}
