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
    int idx;
    TreeNode build(int[] preorder, int[] inorder,int st,int end){
        if(st>end){
            return null;
        }
       int val=preorder[idx++];
        TreeNode root=new TreeNode(val);
        int i=st;
        while(val!=inorder[i]){
            i++;
        }
        root.left=build(preorder,inorder,st,i-1);
        root.right=build(preorder,inorder,i+1,end);
    return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        idx=0;
        return build(preorder,inorder,0,inorder.length-1);

    }
}