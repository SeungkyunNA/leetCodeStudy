/**
 * https://leetcode.com/problems/binary-tree-inorder-traversal/submissions/882695160/
 * Time O(n) , Space O(logn) (maximum size of Stack is depth of Tree) 
 */

 package week7;

 import java.util.ArrayList;
 import java.util.List;
 import java.util.Stack;
 
 public class InorderTraversal {
 
     public static void main(String[] args) {
         TreeNode root = new TreeNode();
         root.val = 1;
         TreeNode two = new TreeNode();
         two.val = 2;
         TreeNode three = new TreeNode();
         three.val = 3;
 
         two.left = three;
         root.right = two;
         System.out.println(inorderTraversal(root).toString());
 
     }
 
     public static List<Integer> inorderTraversal(TreeNode root) {
         
         List<Integer> list = new ArrayList<Integer>();
         if(root == null) {
             return list;
         }
 
         Stack<TreeNode> st = new Stack<TreeNode>();
         Boolean leftVisit = false;
         Boolean flag = false;
         TreeNode current = root;
         
         while(!flag) {
             while(current.left != null && !leftVisit) {
                 st.push(current);
                 current = current.left;
             }
             leftVisit = true;
             list.add(current.val);
 
             if(current.right != null) {
                 current = current.right;
                 leftVisit = false;
             } else {
                 if(st.size() != 0) {
                     current = st.pop();
                 } else {
                     flag = true;
                 }
             }
         }
 
         return list;
     }
 }
 