//program to implement ascending priority queue in c

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#define MAX_LENGTH 20

typedef struct {

	int arr[MAX_LENGTH];
	int front, rear;
}QUEUE;

bool isFull(int rear) 
{
	return (rear == MAX_LENGTH);
}

bool isEmpty(int front)
{
	return (front == -1);
}

void enqueue(QUEUE* q, int ele)
{
	if(isFull(q->rear))
	{
		printf("Queue is full!\n");
		printf("Exiting...");
		exit(0);
	}
	if(q->front == -1) q->front = 0;

	q->rear = q->rear + 1;
	q->arr[q->rear] = ele;
}

int dequeue(QUEUE* q)
{
	if(isEmpty(q->front))
	{
		printf("Underflow!\n");
		printf("Exiting");
		exit(0);
	}

	if(q->front == q->rear)
	{
		int element = q->arr[q->front];
		q->front = q->rear = -1;
		return element;
	}

	int element = q->arr[q->front];
	q->front = q->front + 1;
}

void displayq(QUEUE* q)
{
	printf("--------------------\n");
	if(q->front == -1)
	{
		printf("Queue is empty!");
	}

	int i;
	printf("Queue is:\n");
	for(i=q->front; i<=q->rear; i++)
	{
		printf("%d ", q->arr[i]);
	}
	printf("\n");
}

int main()
{
	QUEUE *q;
	q = (QUEUE*) malloc(sizeof(QUEUE));
	q->front = q->rear = -1;
	int ch, element;
	do
	{
		printf("Press 1.Insert 2.Delete 3.Display 4.Exit: ");
		scanf("%d", &ch);
		switch (ch)
		{
			case 1:
				printf("Input an element: ");
				scanf("%d", &element);
				printf("--------------------\n");
				enqueue(q, element);
				break;

			case 2:		 
				element = dequeue(q);
				printf("Element deleted is: %d", element);
				break;

			case 3:
				displayq(q);
				break;

			case 4:
				printf("--------------------\n");
				printf("Exiting...\n");
				printf("--------------------\n");
				exit(0);
				break;

			default: 
			printf("Invalid Input... please retry\n");
			printf("--------------------\n");
		}

	}while(ch!=4);
	return 0;
}