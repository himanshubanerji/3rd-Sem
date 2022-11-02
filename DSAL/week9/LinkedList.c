#include <stdio.h>
#include <stdlib.h>
#include "LinkedList.h"

/*#define MALLOC(ptr,size) \
	if(!((ptr) = malloc(size))) {\
		printf("Insufficient Memory!"); \
		exit(EXIT_FAILURE); \
			}
			*/

/*typedef struct listNode {
	int data;
	struct listNode *link;
}listNode;
typedef listNode* listptr;
*/

void enqueue(listptr *node, int element) 
{
	listptr newnode = (listNode*) malloc(sizeof(listNode));
	MALLOC(newnode,sizeof(listNode));

	if((*node) == NULL)
	{
		newnode->data = element;
		newnode->link = NULL;
		*node = newnode;
	}
	else
	{
		newnode->data = element;
		newnode->link = NULL;
		(*node)->link = newnode;
	}

}

void dequeue(listptr *head)
{
	if(!(*head))
	{
		printf("Underflow!");
		return;
	}
	else
	{
		listptr temp = (*head)->link;
		free(*head);
		*head = temp;
	}
}

void traverse(listptr *head)
{
	if(!(*head))
	{
		printf("Queue is empty... please insert\n");
		return;
	}
	else
	{
		listptr tr = *head;
		for(;tr->link; tr= tr->link)
			printf("%d->",tr->data);
		printf("%d\n",tr->data);
	}
}
