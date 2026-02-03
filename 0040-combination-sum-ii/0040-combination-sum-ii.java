class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper(candidates, target, 0);
        return res;
    }
    void helper(int[] nums, int k,int i){
        if(k==0){
            res.add(new ArrayList<>(list));
            return;
        }
        if(k<0) return;
        for(int j=i;j<nums.length;j++){
            if(j > i && nums[j] == nums[j-1]) continue;
            list.add(nums[j]);
            helper(nums,k-nums[j],j+1);
            list.remove(list.size()-1);
        }
    }
}