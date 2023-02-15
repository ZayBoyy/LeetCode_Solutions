/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode next = new ListNode(0);
        ListNode output = new ListNode(0, next);
        
        while (l1 != null || l2 != null) {
            ListNode base = new ListNode(0);
            next.next = base; 
            if (l1 == null && l2 != null) {
                next.val += l2.val;
            }        
            else if (l2 == null && l1 != null) {
                next.val += l1.val;
            } 
            else {
                next.val += l1.val + l2.val;
                }

            if (next.val >= 10) {
                    base.val += 1;
                    next.val -= 10;
                }
            
                  
            if (l1 != null)
            l1 = l1.next;
            if (l2 != null)
            l2 = l2.next; 
            if (l1 != null || l2 != null || base.val != 0)
            next = base;
            else 
            next.next = null;

        }
        return output.next;
    }
}
