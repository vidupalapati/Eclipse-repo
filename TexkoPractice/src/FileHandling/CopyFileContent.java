package FileHandling;
import java.io.*;
public class CopyFileContent 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream r = new FileInputStream("C:\\Users\\vikas\\Desktop\\JavaFileHandling\\SampleTextRenamed.txt");
		FileOutputStream w = new FileOutputStream("C:\\Users\\vikas\\Desktop\\JavaFileHandling\\SampleTextNew.txt");
	
		int i;
		while((i=r.read())!=-1)
		{
			w.write((char)i);
		}	
		System.out.println("File copied successfully...");
	}
}
