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
class Solution {
    public ListNode middleNode(ListNode head) {
    //     int size=0;
    //     ListNode tmp=head;
    //     while(tmp!=null){
    //         size++;
    //         tmp=tmp.next;
    //     }
    //     int in=size/2;
    //     tmp=head;
    //    for(int i=0;i<in;i++) tmp=tmp.next;
    //    return tmp;
      ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}