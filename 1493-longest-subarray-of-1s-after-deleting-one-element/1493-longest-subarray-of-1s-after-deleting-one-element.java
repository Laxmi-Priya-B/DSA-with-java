class Solution {
    public int longestSubarray(int[] nums) {
        int j=0;
        int count=0;
        int res=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }
            while(count>1){
                if(nums[j]==0) count--;
                j++;
            }
            res = Math.max(res,i-j);
        }
        return res;
    }
}