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
    public void reorderList(ListNode head) {
        ListNode temp=head;
        Stack<ListNode> s=new Stack<>();
        while(temp!=null){
            s.push(temp);
            temp=temp.next;
        }
        temp=head;
        int n=s.size();
       for(int i=0; i<n/2; i++){
            ListNode ans=s.pop();
           
            ListNode next=temp.next;
           
            temp.next=ans;
            ans.next=next;

            temp=next;
        
        }
        temp.next=null;
        
    }
}