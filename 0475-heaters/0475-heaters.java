class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int res = 0;
        for(int i:houses){
            int min = Integer.MAX_VALUE;
            for(int h:heaters){
                min = Math.min(min, Math.abs(i-h));
            }
            res = Math.max(res, min);
        }
        return res;
    }
}