class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        helper(nums,0);
        return res;
    }
    void helper(int[] nums, int idx){
        res.add(new ArrayList<>(list));
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i] == nums[i-1]) continue;
            list.add(nums[i]);
            helper(nums,i+1);

            list.remove(list.size()-1);
        }
    }
}