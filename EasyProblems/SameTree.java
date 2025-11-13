public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;

        if(p == null || q == null) return false;

        if(p.value != q.value){
            return false;
        }

        boolean leftSame = isSameTree(p.left, q.left);
        boolean rightSame = isSameTree(p.right, q.right);

        if(leftSame && rightSame){
            return true;
        }else{
            return false;
        }
    }
}
