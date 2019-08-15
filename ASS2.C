#include<stdio.h>
#include<conio.h>
void swap(int *,int *);
int main()
{
int x,y;
printf("Enter the two numbers to be swapped");
scanf("%d%d",&x,&y);
swap(&x,&y);
printf("Numbers after swapping:x=%d,y=%d",x,y);
getch();
return 0;
}
void swap(int *a,int *b)
{
	int temp;
	temp=*a;
	*a=*b;
	*b=temp;
}
