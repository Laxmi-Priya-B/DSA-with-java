class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        int min = nums[0];
        int max = nums[0];
        int currmax = 0;
        int currmin = 0;
        for(int i=0;i<nums.length;i++){
            currmax = Math.max(currmax+nums[i],nums[i]);
            max = Math.max(max,currmax);
            currmin = Math.min(currmin+nums[i],nums[i]);
            min = Math.min(min,currmin);
            total+=nums[i];
        }
        if(max >0){
            max = Math.max(max,total-min);
        }
        return max;
    }
}