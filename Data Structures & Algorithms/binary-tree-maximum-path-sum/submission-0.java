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
    int maxValue;
    public int maxPathSum(TreeNode root) {
        maxValue=Integer.MIN_VALUE;
        maxPath(root);
        return maxValue;
    }
    public int maxPath(TreeNode root){
        if(root==null) return 0;

        int leftSub=Math.max(0,maxPath(root.left));
        int rightSub=Math.max(0,maxPath(root.right));

        maxValue=Math.max(maxValue,leftSub+rightSub+root.val);
        return Math.max(leftSub,rightSub)+root.val;
    }
}
