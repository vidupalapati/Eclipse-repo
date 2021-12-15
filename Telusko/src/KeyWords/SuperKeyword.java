package KeyWords;

public class SuperKeyword {

	public static void main(String[] args) 
	{
			BB obj = new BB();
			obj.show();
	}
}
class AA
{
	int i =5;
	
}
class BB extends AA
{
	int i =4;
	public void show()
	{
		System.out.println(super.i);
		//super.i will display AA class's I value 
	}
}
