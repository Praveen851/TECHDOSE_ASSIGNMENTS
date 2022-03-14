/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2){
    int temp = 0;
    struct ListNode *l3 = NULL;
    struct ListNode *t = l3; 
    while(l1 != NULL || l2 != NULL){
        struct ListNode *nn = malloc(sizeof(struct ListNode));
        int sum = temp;
        temp = 0;
        if(l1 != NULL){
            sum += l1->val;
        }
        if(l2 != NULL){
            sum += l2->val;
        }
        if(sum > 9){
            temp = 1;
            sum %= 10;
        }
        nn->val = sum;
        nn->next = NULL;
        if(l3 == NULL){
            l3 = nn;
            t = nn;
        }
        else{
            t->next = nn;
            t=nn;
        }
        if(l1 != NULL){
            l1 = l1->next;
        }
        if(l2 != NULL){
            l2 = l2->next;
        }
    }
    if(temp != 0){        
        struct ListNode *nn = malloc(sizeof(struct ListNode));
        nn->val = temp;
        nn->next = NULL;
        t->next = nn;
    }
    return l3;
}
