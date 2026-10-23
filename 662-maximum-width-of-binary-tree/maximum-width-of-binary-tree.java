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
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q=new LinkedList<>();
        int ans=0;
        q.offer(new Pair<>(root,0));
        while(!q.isEmpty()){
            int size=q.size();
            int left=0;
            int right=0;
            for(int i=0; i<size; i++){
                Pair<TreeNode ,Integer> p=q.poll();
                int idx=p.getValue();
                if(i==0){
                    left=idx;
                }
                if(i==size-1){
                    right=idx;
                }
                if(p.getKey().left!=null){
                    q.offer(new Pair<>(p.getKey().left,2*idx+1));

                }
                 if(p.getKey().right!=null){
                    q.offer(new Pair<>(p.getKey().right,2*idx+2));

                }
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}