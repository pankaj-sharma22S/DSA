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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp=head;
        ListNode[] ans=new ListNode[k];
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int base=count/k;
        int rem=count%k;
        temp=head;
        for(int i=0; i<k; i++){
            int size=base+(i<rem?1:0);
            ans[i]=temp;
            for(int j=1; j<size; j++){
                
                temp=temp.next;
            }
            if(temp!=null){
                ListNode next=temp.next;
                temp.next=null;
                temp=next;
            }
        }
       return ans;
    }
}