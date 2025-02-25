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
    int good = 0;
    void traverse(TreeNode root, int max){
        if(root == null){
            return;
        }

        if(root.val >= max){
            good++;
        }

        max = Math.max(root.val, max);
        traverse(root.left, max);
        traverse(root.right, max);
        
    }
    public int goodNodes(TreeNode root) {
        traverse(root, Integer.MIN_VALUE);
        return good;
    }
}