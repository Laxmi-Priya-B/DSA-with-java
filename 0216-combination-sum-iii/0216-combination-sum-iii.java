class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        helper(k,n,1,0);
        return res;
    }
    void helper(int k,int n,int idx,int sum){
        if(list.size()==k){
            if(sum == n){
                res.add(new ArrayList<>(list));
            }
            return;
        }
        for(int i=idx;i<10;i++){
            if(sum+i>n){
                break;
            }
            list.add(i);
            helper(k,n,i+1,sum+i);
            list.remove(list.size()-1);
        }
    }
}