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
    List<Integer> res=new ArrayList<>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null)
            return res;
        Inorder(root);
        return res;
    }
    public void Inorder(TreeNode root)
    {
        if(root==null)
            return;
        Inorder(root.left);
            if(root!=null)
                res.add(root.val);
        Inorder(root.right);
    }
}