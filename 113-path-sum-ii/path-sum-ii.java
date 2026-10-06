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
    void helper(TreeNode root,List<List<Integer>> res,List<Integer> ans,int targetSum){
       
        if(root==null){
            return;
        }
        ans.add(root.val);
        targetSum-=root.val;
        if(root.left==null && root.right==null){
         if(targetSum==0){
            res.add(new ArrayList<>(ans));
            }
            ans.remove(ans.size()-1);
            return;
        }
     
        helper(root.left,res,ans,targetSum);
        helper(root.right,res,ans,targetSum);
        ans.remove(ans.size()-1);
        
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        helper(root,res,ans,targetSum);
        return res;

    }
}