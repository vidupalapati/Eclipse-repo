package MultiThreading;

public class MyThreadClass implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i+" from Thread "+Thread.currentThread());
		}
	}
	public static void main(String[] args) throws Exception 
	{
		Thread myThread = new Thread(new MyThreadClass());
		myThread.start();
		Thread.sleep(4000);
		myThread.start();
	}

}
