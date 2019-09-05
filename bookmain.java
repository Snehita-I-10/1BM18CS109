import java.util.*;
class bookmain
{	

	
	public static void main(String args[])
	{
	int n;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of books");
	n=s.nextInt();
	book b[]=new book[n];

	for(int i=0;i<n;i++)
	{	b[i]=new book();
		b[i].getdata();
	 	
		
		System.out.println(b[i].toString());
	}
	}
	
}
class book
{	String name,author;
	double price;
	int pages;
	
	book()
	{
	}
	void getdata()
	{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter book name,author,price and number of pages");
	name=s1.next();
	author=s1.next();
	price=s1.nextDouble();
	pages=s1.nextInt();
	}
	
	public String toString()
	{
		return "Name-"+name+" "+"Author-"+author+"Price-"+price+" "+"Pages-"+pages;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
