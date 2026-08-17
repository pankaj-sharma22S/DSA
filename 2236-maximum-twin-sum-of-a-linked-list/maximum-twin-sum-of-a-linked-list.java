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
    public int pairSum(ListNode head) {
        ListNode temp=head;
        
        ArrayList<Integer> list=new ArrayList<>();
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        int i=0;
        int k=list.size()-1-i;
        int ans=Integer.MIN_VALUE;
        while(i<k){
           
           int curr_sum=list.get(i)+list.get(k);
            ans=Math.max(ans,curr_sum);
            i++;
            k--;
        }
        return ans;
    }
}