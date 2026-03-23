class Solution {
    int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        helper(nums,target,0,0);
        return count;
    }

    void helper(int[] nums,int target, int idx, int sum){
        if(idx == nums.length){
            if(sum == target){
                count++;
            }
            return;
        }
        helper(nums,target,idx+1,sum+nums[idx]);
        helper(nums,target,idx+1,sum-nums[idx]);
    }
}