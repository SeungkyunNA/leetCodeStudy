package week2;
import DS.TreeNode;

public class InvertTree {

    public TreeNode invertTree(TreeNode root) {
        
        if(root == null){
            return root;
        }
        if(root.left == null && root.right == null){
            return root;
        }
        
        
        TreeNode leftChild;
        TreeNode rightChild;
        
        if(root.left != null){
             leftChild = root.left;
        }
        else {
            leftChild = null;
        }
        
        if(root.right != null){
            rightChild = root.right;
        }
        else{
            rightChild = null;
        }
        
        root.left = rightChild;
        root.right = leftChild;
        
        if (root.left != null){
            invertTree(root.left);
        }
        if (root.right != null){
            invertTree(root.right);
        }
        
        return root;
        
    }
    
}
