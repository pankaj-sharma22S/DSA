/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node temp=head;
        if(head==null){
            return null;
        }
        Node ans=head;
        Stack<Node> s=new Stack<>();

        while(temp!=null){
            if(temp.child!=null){
                if(temp.next!=null){
                s.push(temp.next);
                }
                temp.next=temp.child;
                temp.child.prev=temp;
                temp.child=null;
            }
            if(temp.next==null && !s.isEmpty()){
                Node next=s.pop();
                temp.next=next;
                next.prev=temp;
            }
            temp=temp.next;

        }
        return head;
    }
}