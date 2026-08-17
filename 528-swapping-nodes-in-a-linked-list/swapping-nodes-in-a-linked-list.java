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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        int i=1;
        int j=1;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int k2=count-k+1;
        System.out.print(count);
        ListNode temp1=head;
       

        while(temp1!=null&&i!=k){
            i++;
            
            temp1=temp1.next;
        }
       
        ListNode temp2=head;
        
        while(temp2!=null&&j!=k2){
            j++;
            
            temp2=temp2.next;
        }
       int a =temp1.val;
       temp1.val=temp2.val;
       temp2.val=a;
        

        
    return head;
    }
}