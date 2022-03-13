/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
//Floyd’s Cycle-Finding Algorithm
bool hasCycle(struct ListNode *head) {
    struct ListNode *fast , *slow;
    fast = slow = head;
    while(slow && fast && fast->next){
        fast = fast->next->next;
        slow = slow->next;
        if(fast == slow)return true;
    }
    return false;
}
