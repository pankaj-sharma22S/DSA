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
    public ListNode partition(ListNode head, int x) {
        ListNode l1=new ListNode(0);
        ListNode l2=new ListNode(0);
        ListNode small=l1;
        ListNode large=l2;
        while(head!=null){
            if(head.val<x){
                small.next=head;
                small=small.next;
            }
            else{
                large.next=head;
                large=large.next;
            }
            head=head.next;
        }
        large.next=null;
        small.next=l2.next;
        return l1.next;
    }
}