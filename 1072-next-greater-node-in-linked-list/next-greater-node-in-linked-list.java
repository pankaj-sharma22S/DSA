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
    public int[] nextLargerNodes(ListNode head) {
       ListNode temp=head;
       List<Integer> list=new ArrayList<>();
       
       while(temp!=null){
            ListNode curr=temp;
            int n=curr.val;
            int maxi=curr.val;
             while(curr!=null){
                maxi=Math.max(maxi,curr.val);
                curr=curr.next;
                if(maxi!=n){
                list.add(maxi);
                break;
                }
              
            }
             if(maxi==n){ 
            list.add(0);
             }
            temp=temp.next;

       } 
       int[] arr = new int[list.size()];

    for (int i = 0; i < list.size(); i++) {
        arr[i] = list.get(i);
        }
       return arr;
    }
}