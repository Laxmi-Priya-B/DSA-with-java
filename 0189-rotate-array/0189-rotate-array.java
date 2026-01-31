class Solution {
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        k = k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        

        // int len = nums.length;
        // for(int i=0;i<k;i++){
        //     int t2;
        //     int temp = nums[len-1];
        //     for(int j=len-1;j>0;j--){
        //         nums[j] = nums[j-1];
        //     }
        //     nums[0] = temp;
        // }
    }
    static void reverse(int[] nums, int l,int r){
        while(l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}