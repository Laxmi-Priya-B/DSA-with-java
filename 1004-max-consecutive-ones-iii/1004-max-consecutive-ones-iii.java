class Solution {
    public int longestOnes(int[] nums, int k) {
        int c0=0;
        int j=0;
        int maxlen=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c0++;
            }
            while(c0>k){
                if(nums[j]==0){
                    c0--;
                }
                j++;
            }
            maxlen = Math.max(maxlen,i-j+1);
        }
        return maxlen;
    }
}