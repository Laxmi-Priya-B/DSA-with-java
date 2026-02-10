class Solution {
    public int longestBalanced(int[] nums) {
        int res =0;
        for(int i=0;i<nums.length;i++){
            Set<Integer> odd = new HashSet<>();
            Set<Integer> even = new HashSet<>();
            for(int j=i; j<nums.length;j++){
                int num = nums[j];
                if(num %2 == 0){
                    even.add(num);
                }
                else{
                    odd.add(num);
                }
                if(even.size() == odd.size()){
                    res = Math.max(res,j-i+1);
                }
            }
            
        }

        return res;
    }
}