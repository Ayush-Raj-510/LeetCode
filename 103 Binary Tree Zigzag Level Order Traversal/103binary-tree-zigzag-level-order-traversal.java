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
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        zig(root);
        return ans;
    }
    public void zig(TreeNode root){
        if(root==null){
            return;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean left_to_right=true;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> list=new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                if(left_to_right){
                    list.addLast(temp.val);
                }else{
                    list.addFirst(temp.val);
                }
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            ans.add(list);
            left_to_right=!left_to_right;
        }
    }
}