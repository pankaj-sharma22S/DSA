/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     Queue <TreeNode> q=new LinkedList<>();    
    public boolean isEvenOddTree(TreeNode root) {
        if(root==null){
            return true;
        }
        int k=0;
        q.offer(root);
        while(!q.isEmpty()){
            int prev=(k%2==0)?0:Integer.MAX_VALUE;
            int size=q.size();
           
            for(int i=0; i<size; i++){
                
            TreeNode poll=q.poll();
            if(k%2==0){
             if(poll.val%2==0 || prev>=poll.val){
            return false;
        }
            }
        else {
            if (poll.val%2!=0 || prev<=poll.val){
             return false;
        }
        }
        prev=poll.val;
        
            if(poll.left!=null){
                q.offer(poll.left);
            }
            if(poll.right!=null){
                q.offer(poll.right);
            }
            }
       k++;
        }
        return true;
    }
}