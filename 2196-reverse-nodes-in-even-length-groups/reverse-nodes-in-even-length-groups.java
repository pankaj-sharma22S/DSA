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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        int gp=1;
        ListNode temp=head;
        int len=0;
         while(temp!=null){
           len++;
           temp=temp.next;
        }
        temp=head;
        int count=0;
        ListNode prev=null;
        while(temp!=null){
            boolean rev=false;
            gp=Math.min(gp,len-count);
            if(gp%2==0){
                rev=true;
                  
             }
            if(rev==true){
                ListNode help=temp;
            for(int i=0; i<gp; i++){
                 help=help.next;

            }
            ListNode start=temp;
             for(int i=0; i<gp; i++){
                ListNode next=temp.next;
                temp.next=help;
               help=temp;
               temp=next;
                }
                if(prev==null){
                    head=help;
                }
                else{
            prev.next=help;}
                prev=start;
        }
            else{
               for(int i=0; i<gp; i++){
                prev=temp;
                temp=temp.next;  
                } 
            }
            count+=gp;
            gp++;
            }
        return head;
    }
}