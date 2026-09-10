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
    private int matchingCount = 0;
    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return matchingCount;
    }

    private int[] dfs(TreeNode root) {
        if(root==null) {
            return new int[]{0,0};
        }

        int[] left=dfs(root.left);
        int[] right=dfs(root.right);

        int totalSum = root.val+left[0] + right[0];
        int totalCount=1+left[1]+right[1];

        if(totalSum/totalCount == root.val) {
            matchingCount++;
        }

        return new int[]{totalSum,totalCount};
    }
}