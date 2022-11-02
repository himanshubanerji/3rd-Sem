#include <stdio.h>
#include <stdlib.h>
#include "LinkedList.h"

int main()
{
	int ch, ele;
	listptr head = NULL, tr, pre = NULL;

	do {
		printf("Press 1.Insert 2.Delete 3.Display 4.Exit ");
		scanf("%d", &ch);
		switch(ch)
		{
			case 1:
				printf("Enter element: ");
				scanf("%d", &ele);
				if(head == NULL)
				{
					enqueue(&head, ele);
				}
				else 
				{
					for(tr=head;tr;tr= tr->link) 
					{
						pre = tr;
					}
	
					enqueue(&pre, ele);
				}
				printf("---------------\n");
				break;

			case 2:
				if(!(head))
				{
					printf("Underflow!\n");
					printf("---------------\n");
					break;
				}
				else
				{
					dequeue(&head);
					printf("Element deleted\n");
					printf("---------------\n");
					break;
				}

			case 3:
				traverse(&head);
				printf("---------------\n");
				break;

			case 4:
				printf("Exiting...\n");
				printf("---------------\n");
				break;
				exit(EXIT_SUCCESS);

			default:
				printf("Invalid Input... try again\n");
				printf("---------------\n");

		}
	}while(ch != 4);
	return 0;
}
