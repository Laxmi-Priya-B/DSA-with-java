class Solution {
    public int[] sortedSquares(int[] nums) {
        int left =0;
        int right = nums.length-1;
        while(left<=right){
            if(left<right){
                nums[left] = nums[left]*nums[left];
                left++;
            }
            else{
                nums[right] = nums[right]*nums[right];
                right--;
            }
            
        }
        Arrays.sort(nums);
        return nums;
    }
}