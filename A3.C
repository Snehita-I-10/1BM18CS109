#include<stdio.h>
#include<conio.h>
int stack[100],choice,top,n,shirt,i;
void push(void);
void pop(void);
void display(void);
int main()
{
top=-1;
printf("Enter the size of stack");
scanf("%d",&n);
printf("Enter 1 to push, 2 to pop,3 to display,4 to exit");

do
{
printf("Enter the choice");
scanf("%d",&choice);
switch(choice)
{
case 1:push();
	break;
case 2:pop();
	break;
case 3:display();
	break;
case 4:exit(0);
	break;
default:printf("Wrong choice");
}
}while(choice!=3);

getch();
return 0;
}
void push()
{
	if(top>=n-1)
	{	printf("stack overflow");
	}
else
	{
	printf("Enter the value to be pushed");
	scanf("%d",&shirt);
	top++;
	stack[top]=shirt;
	}
}
void pop()
	{
	if(top<=-1)
	{	printf("Cupboard is empty");
	}
	else
	{
		printf("The popped element is %d",stack[top]);
		top--;
	}
}
void display()
{
	if(top>=0)
	{	printf("Elements in the cupboard");
		for(i=top;i>=0;i--)
		printf("%d",stack[i]);
		printf("Enter next choice");

	}
	else
	{printf("Stack is empty");
	}
}