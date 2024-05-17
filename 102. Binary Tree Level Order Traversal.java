Ques Link - https://leetcode.com/problems/binary-tree-level-order-traversal/

---------------------------------------- Solution ---------------------------------------------

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(root, ans, 0);
        return ans;
    }
    public void solve(TreeNode root, List<List<Integer>> ans, int i){
        if(root == null) return;

        if(i < ans.size())
            ans.get(i).add(root.val);
        else
            ans.add(new ArrayList(Arrays.asList(root.val)));
        
        solve(root.left, ans, i+1);
        solve(root.right, ans, i+1);
    }
}
