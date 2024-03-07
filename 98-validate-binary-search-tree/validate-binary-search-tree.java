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
    public boolean isValidBST(TreeNode root) {
        return isVB(root,null,null);
    }
    public boolean isVB(TreeNode Node,Integer lower, Integer upper){
         if(Node==null){
             return true;
         }
         if((lower != null && Node.val<=lower) ||(upper!=null&&Node.val>=upper)){
             return false;
         }
         return isVB(Node.left,lower,Node.val)  && isVB(Node.right,Node.val,upper);
    }
}