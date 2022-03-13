#include <stdio.h>
#include<stdlib.h>
struct Node
{
  int data;
  struct Node *next;
};
void append(struct Node **head,int data)
{
  struct Node *newNode=malloc(sizeof(struct Node));
  newNode->data=data;
  newNode->next=NULL;
  if(*head==NULL)*head=newNode;
  else
  {
    struct Node *temp=*head;
    while(temp->next!=0)
    {
      temp=temp->next;
    }
    temp->next=newNode;
  }
}
void display(struct Node **head)
{
  struct Node *temp=*head;
  while(temp->next!=NULL)
  {
    printf("%d->",temp->data);
    temp=temp->next;
  }
  printf("%d\n",temp->data);
}
void reversekblockelements(struct Node **head,int size)
{
  int ctr = 1;
  struct Node *temp = *head;
  while(size != 0 && ctr != size){
    temp = temp->next;
    ctr++;
  }
  struct Node *prev = NULL, *curr = temp->next, *nextNode;
  if(size == 0){
    curr = *head;
  }
  while(curr != NULL){
    nextNode = curr->next;
    curr->next = prev;
    prev = curr;
    curr = nextNode;
  }
  if(size == 0){
    *head = prev;
  }
  else
  temp->next = prev;
}
int main()
{
  int n;
  scanf("%d",&n);
  int data;
  struct Node *head=NULL;
  for(int i=0;i<n;i++)
  {
    scanf("%d",&data);
    append(&head,data);
  }
  int k;
  scanf("%d",&k);
  if(k>n){
    printf("K should be lesser than N");
  }
  else{
    display(&head);
    printf("\n");
    reversekblockelements(&head,n-k);
    display(&head);
  }
}
