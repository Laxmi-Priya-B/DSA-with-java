class Solution {
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> lis = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        helper(0,nums);
        return list;
    }

    void helper(int i, int[] nums){
        if(i >= nums.length){
            list.add(new ArrayList<>(lis));
            return;
        }
        lis.add(nums[i]);
        helper(i+1,nums);
        lis.remove(lis.size() -1);
        helper(i+1,nums);
    }
}