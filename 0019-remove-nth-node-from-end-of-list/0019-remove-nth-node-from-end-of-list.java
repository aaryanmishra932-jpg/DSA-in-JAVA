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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<Integer>arr=new ArrayList<>();
       while(head!=null){
        arr.add(head.val);
        head=head.next;
       } 
       int index =arr.size()-n;
       arr.remove(index);
       ListNode d=new ListNode(0);
       ListNode tem=d;
       for(int i=0;i<arr.size();i++){
        ListNode ne=new ListNode(arr.get(i));
        tem.next=ne;
        tem=tem.next;
       }
       return d.next;
    }
}