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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp1=head;
        ListNode temp2=head;
        ListNode prev1=null;
        ListNode prev2=null;
        ListNode next1=null;
        ListNode next2=null;

        if(head==null&& head.next==null &&left==right){
            return head;
        }
        while(temp1!=null && temp1.next!=null&& left>1 ){
            prev1=temp1;
            temp1=temp1.next;
            left--;
        }
        next1=temp1.next;
          while(temp2!=null && temp2.next!=null && right>1 ){
            prev2=temp2;
            temp2=temp2.next;
            right--;
        }
        next2=temp2.next;
        ListNode curr=temp1;
        ListNode prev=next2;

        while(curr!=next2){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
    if(prev1!=null){
        prev1.next=temp2;
    }
    else{
        head=temp2;
    }
    return head;
    }
}