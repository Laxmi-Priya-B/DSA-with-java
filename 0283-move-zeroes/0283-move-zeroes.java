class Solution {
    public void moveZeroes(int[] nums) {
        int c =0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[k] = nums[i];
                k++;
            }
        }
        c=nums.length-k;
        int i=nums.length-1;
        while(c>0){
            nums[i]=0;
            i--;
            c--;
        }
    }
}