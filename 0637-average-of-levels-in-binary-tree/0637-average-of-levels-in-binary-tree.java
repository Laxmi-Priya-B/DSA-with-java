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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            double sum = 0;
            double avg =0;
            for(int i=0;i<size;i++){
                root = q.poll();
                sum += root.val;
                if(root.left!=null) q.offer(root.left);
                if(root.right!=null) q.offer(root.right);

            }
            avg = sum/size;
            result.add(avg);
        }
        return result;
    }
}