class Solution {
    int res;
    public int subsetXORSum(int[] nums) {
        helper(0,nums,0);
        return res;
    }
    public void helper(int i,int[] nums,int xor){
        if(i==nums.length){
            res += xor;
            return;
        }

        helper(i+1,nums,xor^nums[i]);
        helper(i+1,nums,xor);
    }
}