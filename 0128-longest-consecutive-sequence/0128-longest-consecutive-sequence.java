class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        int len = 1;
        int count=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]) continue;
            if(nums[i+1]-nums[i]!=1){
                count=1;
            }
            else{
                count++;
            }
            
            len = Math.max(len,count);
        }
        return len;
    }
}