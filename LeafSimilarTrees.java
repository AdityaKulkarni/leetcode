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
    void getLeaves(TreeNode root, List<Integer> leaves){
        if(root == null){
            return;
        }

        if(root.left == null && root.right == null){
            leaves.add(root.val);
        }

        getLeaves(root.left, leaves);
        getLeaves(root.right, leaves);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaf1 = new ArrayList();
        List<Integer> leaf2 = new ArrayList();

        /**
         * Iterative
         */
        /*List<Integer> leaf1 = new ArrayList();
        List<Integer> leaf2 = new ArrayList();

        Stack<TreeNode> q1 = new Stack(), q2 = new Stack();

        q1.push(root1);
        while(!q1.isEmpty()){
            TreeNode current = q1.pop();
            if(current.left == null && current.right == null){
                leaf1.add(current.val);
                continue;
            }

            if(current.left != null){
                q1.push(current.left);
            }
            if(current.right != null){
                q1.push(current.right);
            }
        }

        q2.push(root2);
        while(!q2.isEmpty()){
            TreeNode current = q2.pop();
            if(current.left == null && current.right == null){
                leaf2.add(current.val);
                continue;
            }

            if(current.left != null){
                q2.push(current.left);
            }
            if(current.right != null){
                q2.push(current.right);
            }
        }

        System.out.println("1: " + leaf1 + " 2: " + leaf2);

        return leaf1.equals(leaf2);*/

        /**
         * Recursion
         */

        getLeaves(root1, leaf1);
        getLeaves(root2, leaf2);

        return leaf1.equals(leaf2);
    }
}