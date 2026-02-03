class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        helper(0, nums);
        return res;
    }
    void helper(int i, int[] nums){
        if(i>=nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        helper(i+1,nums);

        list.remove(list.size()-1);
        helper(i+1,nums);
    }

}