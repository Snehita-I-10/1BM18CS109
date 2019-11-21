import java.util.*;
class thread1 extends Thread
{
	int num;
	thread1(int a)
	{
		num=a;
		this.start();
	}
	public void run()
	{
		try{
			if(num<=5)
			{
				thread1 t=new thread1(num+1);
				this.sleep(10000/num);
				System.out.println("Thread"+num);
				
				
			}
			}catch(InterruptedException e)
			{
			System.out.println("Interrupted Exception");
			}
		
	}
}
class threadmain
{
	public static void main(String x[])
	{
		
		thread1 t=new thread1(1);}
		
		
	}


