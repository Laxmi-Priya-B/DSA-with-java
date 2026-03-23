class Solution {
        List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        helper(nums,used);
        return res;
    }

    void helper(int[] nums,boolean[] used){
        if(list.size() == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            if(i>0 && nums[i] == nums[i-1] && !used[i-1]){
                continue;
            }
            list.add(nums[i]);
            used[i] = true;
            helper(nums,used);
            list.remove(list.size()-1);
            used[i] = false;
        }

    }
}