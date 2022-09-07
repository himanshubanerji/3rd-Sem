#include <stdio.h>
typedef struct {
	int day;
	int *month;
	int year;

}DOB;

typedef struct {
	int reg_no;
	char *name;
	char address[50];
	
}STU_INFO;

typedef struct {
	char *college_name;
	char university_name[50];

}COLLEGE;

typedef struct {
	DOB *d;
	STU_INFO s;
	COLLEGE c;

}STUDENT;

int main ()
{
	STUDENT *s1;
	s1 = calloc (1,sizeof(STUDENT));

	s1->d = calloc(1,sizeof(DOB));
	s1->d->month = calloc(1,sizeof(int));
	s1->s->name = calloc(30,sizeof(char));
	s1->c->college_name = calloc(30,sizeof(char));

	printf("Enter the details of the student:\n");
	printf("Input the date of birth in DD/MM/YY: ");
	scanf("%d %d %d", s1->d.day, s1->d->month, s1->d.year);
	printf("Enter the student information: ");

	return 0;
}
