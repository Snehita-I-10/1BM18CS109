#include<stdio.h>
#include<conio.h>
struct student{
char name[100];
int credits[6];
int marks[6];
}s1;
int main()
{
int grade,i,sum=0;
float sgpa;
printf("enter name");
scanf("%c",s1.name);
for(i=1;i<=6;i++)
{
printf("enter marks of the subject %d ",i);
fflush(stdin);
scanf("%d",&s1.marks[i]);
printf("enter credit points of the subject %d ",i);
scanf("%d",&s1.credits[i]);
}
for(i=1;i<=6;i++)
{
if(s1.marks[i]>=90 && s1.marks[i]<=100)
grade=10;
else if(s1.marks[i]>=75 && s1.marks[i]<90)
grade=9;
else if(s1.marks[i]>=60 && s1.marks[i]<75)
grade=8;
else if(s1.marks[i]>=40 && s1.marks[i]<60)
grade=7;
else
grade=0;
sum=sum+(grade*s1.credits[i]);
}
sgpa=sum/30;
printf("%f",sgpa);
getch();
return 0;
}





