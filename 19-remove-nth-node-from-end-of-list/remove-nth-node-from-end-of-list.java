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
        // ListNode temp=head;
        //   ListNode temp = new ListNode();
        ListNode temp=head;
          
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println(count);
    if(count==n){
        return head.next;
    }
    else{
        temp=head;
        // temp=temp.next;
        n=count-n+1;
        System.out.println(n);

        int i=1;
        while(i!=n-1){
            temp=temp.next;
            i++;
        }
        System.out.println(i);

       
        temp.next=temp.next.next;
        
       
        
    }
        return head;
    }
}