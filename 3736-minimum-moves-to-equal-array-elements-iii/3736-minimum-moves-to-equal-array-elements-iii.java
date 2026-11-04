class Solution {
    public int minMoves(int[] nums) {
        int max = 0;
        int sum = 0;
        for(int i:nums){
            sum += i;
            max = Math.max(max,i);
        }
        return nums.length*max-sum;
    }
}