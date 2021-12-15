package MultiThreading;

public class ThreadClass extends Thread 
{
	public synchronized void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i+" from Thread "+Thread.currentThread());
		}
	}
	public static void main(String[] args) 
	{
		ThreadClass t = new ThreadClass();
		t.start();
		ThreadClass1 t1=new ThreadClass1();
		t1.start();

	}
}
class ThreadClass1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i+" from Thread "+Thread.currentThread());
		}
	}
}
