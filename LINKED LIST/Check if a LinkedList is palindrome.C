/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


bool isPalindrome(struct ListNode* head){
    
    struct ListNode *trev = NULL, *temp = head;
    while(temp != NULL){
        struct ListNode *nn = malloc(sizeof(struct ListNode));
        nn->val = temp->val;
        nn->next = NULL;
        if(trev == NULL){
            trev = nn;
        }
        else{
            struct ListNode *t = trev;
            trev = nn;
            trev->next = t;
        }
        temp = temp->next;
    }
    while(trev != NULL){
        if(head->val != trev->val){
            return false;
        }
        trev = trev->next;
        head = head->next;
    } 
    return true;
}
