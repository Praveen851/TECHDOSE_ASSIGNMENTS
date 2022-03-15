/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *detectCycle(struct ListNode *head) {
    struct ListNode *fast, *slow, *sp;
    fast = slow = sp = head;
    while(fast && fast->next){
        fast = fast->next->next;
        slow = slow->next;
        if(fast == slow){
            while(sp != fast){
                sp = sp->next;
                fast = fast->next;
            }
            return sp;
        }
    }
    return NULL;
}
