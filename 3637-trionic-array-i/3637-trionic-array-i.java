class Solution {
    public boolean isTrionic(int[] nums) {
        int n= nums.length;
        int i=0;
        while(i+1 < n && nums[i] < nums[i+1]){
            i++;
        }
        if(i==0) return false;
        int temp = i;
        while(i+1 < n && nums[i+1] < nums[i]){
            i++;
        }
        if(i==temp) return false;
        temp =i;
        while(i+1 < n && nums[i] <nums[i+1]){
            i++;
        }
        if(i==temp) return false;
        return i ==n-1;
    }
}