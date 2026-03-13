class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int n:candies){
            if(n>max){
                max=n;
            }
        }
        List<Boolean> res = new ArrayList<>();
        for(int n:candies){
            if(n+extraCandies >= max){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }
        return res;
    }
}