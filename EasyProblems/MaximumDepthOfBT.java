public class MaximumDepthOfBT {

     public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        if(root.left == null && root.right == null) return 1;

        int leftSide = maxDepth(root.left);
        int rightSide = maxDepth(root.right);
        
        // Need to add +1 to account for the current node. Without it we would only count the nodes below the current node
        return Math.max(leftSide, rightSide) + 1;
    }
}
