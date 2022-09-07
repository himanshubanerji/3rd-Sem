#include <stdio.h>
typedef struct {
	int real;
	int img;

}COMPLEX;

void addition(COMPLEX x, COMPLEX y)
{
	COMPLEX add;
	add.real = x.real + y.real;
	add.img = x.img + y.img;
	printf("\n%d+%di + %d+%di = %d+%di", x.real,x.img,y.real,y.img,add.real,add.img);
}

void subtract(COMPLEX x, COMPLEX y)
{
	COMPLEX subtract;
	subtract.real = x.real - y.real;
	subtract.img = x.img - y.img;
	printf("\n%d+%di - %d+%di = %d+%di", x.real,x.img,y.real,y.img,subtract.real,subtract.img);
}

void multiply(COMPLEX x, COMPLEX y)
{
	COMPLEX mul;
	mul.real = (x.real*y.real) - (x.img*y.img);
	mul.img = (x.real*y.img) + (x.img*y.real);
	printf("\n%d+%di * %d+%di = %d+%di\n", x.real,x.img,y.real,y.img,mul.real,mul.img);

}

int main()
{
	COMPLEX x ,y;
	printf("Enter real and imaginary part for number1: ");
	scanf("%d %d", &x.real, &x.img);
	printf("Enter real and imaginary part for number2: ");
	scanf("%d %d", &y.real, &y.img);

	addition(x,y);
	subtract(x,y);
	multiply(x,y);

	return 0;
}
