class Solution {
    public int[] sortedSquares(int[] nums) {
        int left =0;
        int right = nums.length-1;
        int pos =nums.length-1;
        int[] res = new int[nums.length];
        while(left<=right){
            int l = nums[left]*nums[left];
            int r=nums[right]*nums[right];
            if(l>r){
                res[pos] = l;
                left++;
            }
            else{
                res[pos] = r;
                right--;
            }
            pos--;
        }
        // Arrays.sort(nums);
        return res;
    }
}