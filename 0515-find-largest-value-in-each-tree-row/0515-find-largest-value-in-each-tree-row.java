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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            int val = Integer.MIN_VALUE;
            for(int i =0;i<size;i++){     
                root = q.poll();           
                if(root.left!=null){
                    q.offer(root.left);
                }
                if(root.right!=null){
                    q.offer(root.right);
                }
                int newVal = root.val;
                if(newVal > val){
                    val = newVal;
                }
            }
            result.add(val);
        }
        return result;
    }
}