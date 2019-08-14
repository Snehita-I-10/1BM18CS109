#include<stdio.h>
#include<conio.h>

struct student{
int id[100];
int age[100];
int marks[100];
}s;
int main()
{
int i,n,count=0;
printf("Enter number of students");
scanf("%d",&n);
for(i=0;i<n;i++)
{
printf("Enter student's id,age and marks");
   scanf("%d\n%d\n%d",&s.id[i],&s.age[i],&s.marks[i]);
}
for(i=0;i<n;i++)
{
	if(s.age[i]>20 && s.marks[i]>=0 && s.marks[i]<=100)
	{
		if(s.marks[i]>=65)
		{
			printf("Student with id %d,age %d and marks %d is eligible to seek admission in the university\n",s.id[i],s.age[i],s.marks[i]);
			count++;
		}
	}
}
if(count==0)
{
printf("None of the students are eligible");
}
getch();
return 0;
}