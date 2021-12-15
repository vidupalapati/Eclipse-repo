package FileHandling;

import java.io.*;

public class FileInfo {

	public static void main(String[] args) 
	{
		File f = new File("C:\\Users\\vikas\\Desktop\\JavaFileHandling\\SampleText.txt");
		
		if(f.exists())
		{
			System.out.println("File Name : "+f.getName());
			System.out.println("File exists at : "+f.getAbsolutePath());
			System.out.println("File writable ? : "+f.canWrite());
			System.out.println("File Readable ? : "+f.canRead());
			System.out.println("File size : "+f.length());
			System.out.println("File deleted : "+f.delete());
		}
		else	
		{
			System.out.println("File doesnot exist !");
		}
	}
}
