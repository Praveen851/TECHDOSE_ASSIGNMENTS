/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* deleteDuplicates(struct ListNode* head){
    if(head == NULL || head->next ==NULL)return head;
    struct ListNode *temp = head, *prev = head;
    while(temp!=NULL){
        if(prev->val != temp->val){
            prev->next = temp;
            prev = temp;
        }
        temp = temp->next;
    }
     prev->next = temp;
    return head;
}
