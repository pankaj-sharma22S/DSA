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
       if(head==null ){
        return null;
       }
        ListNode temp=head;
        if(head.next==null){
         return head;
        }
        ListNode curr=head.next;

        while(curr!=null){
            if(curr.val!=temp.val ){
                temp=temp.next;
                temp.val=curr.val;    
               

            }    
            else{
                // temp=temp.next;
                

                curr=curr.next;
            }
        }
        temp.next=null;
        return head;
    }
}