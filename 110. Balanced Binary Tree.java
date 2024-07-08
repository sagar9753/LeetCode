Ques Link - https://leetcode.com/problems/balanced-binary-tree/

--------------------------------- Solution --------------------------------

class Solution {
    private boolean ans = true;
    public boolean isBalanced(TreeNode root) {
        solve(root);
        return ans;
    }

    public int solve(TreeNode root){
        if(root == null || !ans)
            return 0;

        int left = solve(root.left);
        int right = solve(root.right);

        if(Math.abs(left - right) > 1)
            ans = false;
        
        return Math.max(left, right) + 1;
    }
}
