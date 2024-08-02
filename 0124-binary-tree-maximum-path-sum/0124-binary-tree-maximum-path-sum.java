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
    private int m=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        ma(root);
        return m;
    }
    private int ma(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=Math.max(ma(root.left),0);
        int r=Math.max(ma(root.right),0);
        int sum=root.val+l+r;
        m=Math.max(sum,m);
        return root.val+Math.max(l,r);
    }
}