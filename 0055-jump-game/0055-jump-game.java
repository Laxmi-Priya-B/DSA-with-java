class Solution {
    public boolean canJump(int[] nums) {
        int len =0;
        if(nums.length==0) return true;
        for(int i=0;i<nums.length;i++){
            if(i>len) return false;
            len = Math.max(len,i+nums[i]);
        }
        return true;
    }
}