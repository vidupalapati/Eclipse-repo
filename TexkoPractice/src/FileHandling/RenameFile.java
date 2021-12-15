package FileHandling;
import java.io.*;
public class RenameFile {

	public static void main(String[] args)
	{
		File src = new File("C:\\Users\\vikas\\Desktop\\JavaFileHandling\\SampleText.txt");
		File dest = new File("C:\\Users\\vikas\\Desktop\\JavaFileHandling\\SampleTextRenamed.txt");
		
		if(src.exists())
		{
			src.renameTo(dest);
			System.out.println("File renamed successfully...");
		}
		else
		{
			System.out.println("File doesnot exist..! ");
		}
	}

}
