#include <stdio.h>
#include <stdlib.h>
#define MAX_LENGTH 50

typedef struct {
	char name[MAX_LENGTH];
	int rollno;
	float cgpa;
}STUDENT;

int main() 
{
	STUDENT *s1;
	int n, i, j;
	printf("Enter the number of students: ");
	scanf("%d", &n);
	s1 = (STUDENT*) calloc(n, sizeof(STUDENT));
	for(i=0; i<n; i++)
	{
		printf("Input the details of the student%d: ",i+1);
		fgets(s1[i].name, MAX_LENGTH, stdin);
		fflush(stdin);
		scanf("%d",&s1[i].rollno);
		scanf("%f",&s1[i].cgpa);

	}

	STUDENT temp;
	for(i=0; i<n; i++)
	{
		for(j=0; j<n-1-i; j++)
		{
			if(s1[j].rollno > s1[j+1].rollno)
			{
				temp = s1[j];
				s1[j] = s1[j+1];
				s1[j+1] = temp;
			}
		}
	}

	printf("The details of the student in ascending order is: ");
	for(i=0; i<n; i++, s1++) //either we use s1[i].name or s1->name & s1++
	{
		printf("\n%s %d %f", s1->name, s1->rollno, s1->cgpa);
	}

	return 0;
}
