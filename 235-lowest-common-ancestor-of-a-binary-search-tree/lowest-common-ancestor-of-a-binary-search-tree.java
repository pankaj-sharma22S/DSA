/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int pv=p.val;
        int qv=q.val;
        if(root==null){
            return null;
        }
        TreeNode curr=root;
        while(curr!=null){
            if(pv<curr.val && qv<curr.val){
                curr=curr.left;
            }
           else if(pv>curr.val && qv>curr.val){
                curr=curr.right;
            }
            else{
                return curr;
            }
        }
        return null;
    }
}