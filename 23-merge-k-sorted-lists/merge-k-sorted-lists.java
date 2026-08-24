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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list=new ArrayList<>();
        ListNode answer=new ListNode(-1);
        ListNode ans=answer;
        for(int i=0; i<lists.length; i++){
            ListNode temp=lists[i];
            while(temp!=null){
                list.add(temp.val);
                temp=temp.next;
            }
        }
        Collections.sort(list);
        for(int num:list){
            ans.next=new ListNode(num);
            ans=ans.next;
        }        
        ans.next=null;
        return answer.next;
    }
}