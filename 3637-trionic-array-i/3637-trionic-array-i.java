class Solution {
    public boolean isTrionic(int[] nums) {
        int n= nums.length;
        int i=0;
        while(i+1 < n && nums[i] < nums[i+1]){
            i++;
        }
        if(i==0) return false;
        int mid = i;
        while(i+1 < n && nums[i+1] < nums[i]){
            i++;
        }
        if(i==mid) return false;
        int last =i;
        while(i+1 < n && nums[i] <nums[i+1]){
            i++;
        }
        if(i==last) return false;
        return i ==n-1;
    }
}