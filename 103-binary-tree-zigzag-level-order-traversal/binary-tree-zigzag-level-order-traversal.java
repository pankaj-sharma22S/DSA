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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> res=new ArrayList<>();
         int k=0;
        Queue<TreeNode> q=new LinkedList<>(); 
        if(root==null){
            return res;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> ans=new ArrayList<>();
            for(int i=0; i<n; i++){
                TreeNode node=q.poll();
                ans.add(node.val);
                if(node.left!=null){
                    q.offer(node.left);
                }
                 if(node.right!=null){
                    q.offer(node.right);
                }
            }
            if(k%2==0){
            res.add(ans);
            }
            else{
                Collections.reverse(ans);
                res.add(ans);
            }
            k++;
        }
    return res;
    }

}