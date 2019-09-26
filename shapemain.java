import java.util.*;
abstract class shape{
	double p,q;
	shape(double a)
	{ 	p=a;
		
	}
	abstract double printArea();
}
class rectangle extends shape
{	
	double q;
	rectangle(double a,double b)
	{
		super(a);
		 q=b;
	}
	double printArea()
	{	return p*q;
	}
}
class triangle extends shape
{	double q;
	triangle(double a,double b)
	{
		super(a);
		 q=b;
	}
	double printArea()
	{	return 0.5*p*q;
	}
}
class circle extends shape
{
	circle(double a)
	{
		super(a);
	}
	double printArea()
	{	return 3.14*p*p;
	}
}
class shapemain{
	public static void main(String X[])
	{	
		Scanner sc=new Scanner(System.in);
		int ch;
		double d1,d2;
		shape s;
		while(true)
		{
		System.out.println("Enter 1:To calculate area of a rectangle"+"\n"+" 2:To calculate area of a triangle"+"\n"+ "3:To calculate area of a circle "+"\n"+"4:exit");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1: System.out.println("Enter length and breadth of the rectangle");
					d1=sc.nextDouble();
					d2=sc.nextDouble();
					rectangle r=new rectangle(d1,d2);
					
					System.out.println("Area is"+r.printArea());
					break;
			case 2: System.out.println("Enter height and base  of the triangle");
					d1=sc.nextDouble();
					d2=sc.nextDouble();
					triangle t=new triangle(d1,d2);
					
					System.out.println("Area is"+t.printArea());
					break;
			case 3: System.out.println("Enter radius of the circle");
					d1=sc.nextDouble();
					
					circle c=new circle(d1);
					
					System.out.println("Area is"+c.printArea());
					break;
			case 4:System.exit(0);
			default:System.out.println("Wrong choice");
			break;
		}
		
		}
	}
}
					
		
	


