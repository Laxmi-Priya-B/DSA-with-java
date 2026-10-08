class Solution {
    public int splitArray(int[] nums, int m) {
        int n = nums.length;
        if(m>n){
            return -1;
        }
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int i =0;i<n;i++){
            low = Math.max(low,nums[i]);
            high += nums[i];
        }
        while(low <=high){
            int mid = (low+high)/2;
            int students = helper(nums,mid);
            if(students > m){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
            
        }
        return low;
    }
    int helper(int[] nums, int maxSum){
        int n = nums.length;
        int parts = 1;
        int subSum = 0;
        for(int i=0;i<n;i++){
            if(subSum +nums[i]<=maxSum){
                subSum += nums[i];
            }
            else{
                parts++;
                subSum = nums[i];
            }
        }
        return parts;
    }
}