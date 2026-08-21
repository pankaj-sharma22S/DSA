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
    public ListNode deleteDuplicates(ListNode head) {
     ListNode dummy=new ListNode(0);
     dummy.next=head;
     ListNode temp=dummy;
     ListNode curr=head;
    while(curr!=null){
        
        if(curr.next!=null && curr.val==curr.next.val){
            
            while(curr.next!=null &&curr.next.val==curr.val){
            curr=curr.next;
            }
            temp.next=curr.next;
            curr=curr.next;
        }
        else{
            temp.next=curr;
            curr=curr.next;
            temp=temp.next;
            
        }
    }
    temp=null;
return dummy.next;
    }
   
}