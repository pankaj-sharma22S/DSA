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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode temp=dummy.next;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=dummy.next;
       ListNode previous=dummy;
        int Acount=count/k;
        for(int i=0; i<Acount; i++){
            int j=k;    
            ListNode last=temp;  
            ListNode help=temp;   
            while(j>1){
                help=help.next;
                j--;
            }
            ListNode prev=help.next;            ;
            j=k;
            while(j>0){
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
            j--;
        }
        previous.next=prev;
        previous=last;
        }
        return dummy.next;
    }
}