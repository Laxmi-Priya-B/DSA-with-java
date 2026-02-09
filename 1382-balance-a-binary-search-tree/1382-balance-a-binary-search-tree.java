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
    List<Integer> inorderList = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);

        return buildTree(0, inorderList.size() -1);
    }

    void inorder(TreeNode node){
        if(node == null) return;

        inorder(node.left);
        inorderList.add(node.val);
        inorder(node.right);
    }

    TreeNode buildTree(int left, int right){
        if(left > right) return null;

        int mid = (left+right)/2;
        TreeNode root = new TreeNode(inorderList.get(mid));
        root.left = buildTree(left,mid-1);
        root.right = buildTree(mid+1,right);
        return root;
    }
}