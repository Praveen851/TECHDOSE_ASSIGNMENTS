/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

void reverseNodes(struct ListNode *head, int k){
    // printf("%d ", head->val);
    struct ListNode *before = head;
    head = head->next;
    struct ListNode *curr = head, *succ, *prev = NULL;
    for(int i = 0; i < k; i++){
        succ = curr->next;
        curr->next = prev;
        prev = curr;
        curr = succ;
    }
    head->next = curr;
    before->next = prev;
    
}

struct ListNode* reverseKGroup(struct ListNode* head, int k){

    int len = 0;
    struct ListNode *temp = head;
    while(temp != NULL){
        len++;
        temp = temp->next;
    }
    struct ListNode *curr = head, *succ, *prev = NULL, *last;
    for(int i = 0; i < k; i++){
        succ = curr->next;
        curr->next = prev;
        prev = curr;
        curr = succ;
    }
    last = head;
    head->next = curr;
    head = prev;
    struct ListNode *toPass = last;
    for(int i = k-1; i < (len/k)*k - 1; i++){
        if((i+1)%k == 0 ){
            reverseNodes(toPass, k);
        }
        toPass=toPass->next;
    }
    return head;
}
