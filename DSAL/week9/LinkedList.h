
#ifndef LinkedList_H
#define LinkedList_H

#include <stdio.h>      
#include <stdlib.h>

#define MALLOC(ptr,size) \
         if(!((ptr) = malloc(size))) {\
                 printf("Insufficient Memory!"); \
                 exit(EXIT_FAILURE); \
                         }

                 
typedef struct listNode {
	int data;
	struct listNode *link;
}listNode;
typedef listNode* listptr;

void enqueue(listptr*, int);
void dequeue(listptr*);
void traverse(listptr*);

#endif
