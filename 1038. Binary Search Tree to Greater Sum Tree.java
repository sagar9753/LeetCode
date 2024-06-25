Ques Link - https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree

------------------------------------ Solution --------------------------------------------

class Solution {
    public TreeNode bstToGst(TreeNode root) {
        int[] sum = new int[1];
        solve(root, sum);
        return root;
    }
    public void solve(TreeNode root, int[] sum){
        if(root == null)
            return;

        solve(root.right, sum);

        sum[0] += root.val;
        root.val = sum[0];

        solve(root.left, sum);
    }
}
