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
   
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q=new LinkedList();
        List<List<Integer>> res=new ArrayList<>();
        
        if(root==null){
           
            return res;
        }
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> ans=new ArrayList<>();
            int size=q.size();
            for(int i=0; i<size; i++){
                TreeNode node=q.poll();
                ans.add(node.val);
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
        res.addFirst(ans);
        }
return res;
    }
}