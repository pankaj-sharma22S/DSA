/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map=new HashMap<>();
        if(head==null){
            return head;
        }
        Node temp=head;
       
         while(temp!=null){
            
            Node copy=new Node(temp.val);
           map.put(temp,copy);
           temp=temp.next;
        }
        temp=head;
        while(temp!=null){
           Node newhead=map.get(temp);
           newhead.next=map.get(temp.next);
           newhead.random=map.get(temp.random);
        temp=temp.next;
        }
    return map.get(head);
        
    }
}