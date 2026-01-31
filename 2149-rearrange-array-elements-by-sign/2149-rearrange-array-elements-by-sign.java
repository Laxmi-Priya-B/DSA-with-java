class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len];
        int p=0;
        int n=1;
        for(int i=0;i<len;i++){
            if(nums[i]>0){
                arr[p] = nums[i];
                p+=2;
            }
            if(nums[i]<0){
                arr[n] = nums[i];
                n+=2;
            }
        }
        return arr;
    }
}