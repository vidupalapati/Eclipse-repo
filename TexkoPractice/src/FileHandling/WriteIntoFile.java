package FileHandling;
import java.io.*;
public class WriteIntoFile 
{
	public static void main(String[] args) 
	{
		try
		{
			FileWriter f = new FileWriter("C:\\Users\\vikas\\Desktop\\JavaFileHandling\\SampleText.txt");
			
			try
			{
				f.write("Name : Vikas R");
				f.append("\nAge : 26");
				f.append("\nGender : Male");
				f.append("\nQualification : B.E");
				f.append("\nStatus : Single");
			}
			finally
			{
				f.close();
			}
			System.out.println("Data successfully written..!");
		}
		catch(IOException i)
		{
			System.out.println("Exception handled");
		}
	}
}
