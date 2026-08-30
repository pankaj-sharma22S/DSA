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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0){
            return head;
        }
        ListNode prev=null;
        ListNode temp=head;
        int size=0;
        
        while(temp!=null){
            size++;
            prev=temp;
            temp=temp.next;
        }
        k=k%size;
        if(k==0){
            return head;
        }
        int d=size-k;
        int i=0;
        temp=head;
        while(i<d-1){
            i++;
            temp=temp.next;
        }
        ListNode newhead=temp.next;
        temp.next=null;
        prev.next=head;
        return newhead;
    }
}