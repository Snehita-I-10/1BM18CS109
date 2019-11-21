import java.util.*;
class sortmain
{
public static void main(String x[])
{
int arr[]={2,1,4,3,5};
int arr1[]={2,1,4,3,5};
int temp,i,j;
thread1 obj=new thread1(arr);

	for(i=0;i<5;i++)
	{	for(j=0;j<5;j++)
		{
			if(arr[j]>arr[i])
			{
			temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
			}
		}
	}
	for(i=0;i<5;i++)
		System.out.println(arr[i]);

}
}
class thread1 implements Runnable
{
int temp,i,j;
Thread t;
int arr1[];
thread1(int arr[])
{
	t=new Thread(this);
	arr1=arr;
	t.start();
}
public void run()
{
	for(i=0;i<5;i++)
	{	for(j=0;j<5;j++)
		{
		if(arr1[j]<arr1[i])
		{
		temp=arr1[j];
		arr1[j]=arr1[i];
		arr1[i]=temp;
		}
		}
	}
	for(i=0;i<5;i++)
		System.out.println(arr1[i]);
}

}





