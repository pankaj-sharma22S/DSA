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
    int n;
    TreeNode   build(int[] inorder, int[] postorder,int st,int end){
       if(st>end){
        return null;
       }
        int val=postorder[n--];
        TreeNode root=new TreeNode(val);
        int i=st;
        while(inorder[i]!=root.val){
            i++;
        }
        root.right=build(inorder,postorder,i+1,end);
        root.left=build(inorder,postorder,st,i-1);
        return root;

        
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
         n=postorder.length-1;
        int idx=postorder[n];
        return build(inorder,postorder,0,inorder.length - 1);
    }
}