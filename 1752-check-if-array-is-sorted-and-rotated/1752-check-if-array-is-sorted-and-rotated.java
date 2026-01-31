class Solution {
    public boolean check(int[] nums) {
        int n= nums.length;
        int drop = 0;
        if(n<=1) return true;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                drop++;
                if(drop>1) return false;
            }
        }
        if(drop==1 && nums[n-1] > nums[0]) return false;
        return true;
    }
}