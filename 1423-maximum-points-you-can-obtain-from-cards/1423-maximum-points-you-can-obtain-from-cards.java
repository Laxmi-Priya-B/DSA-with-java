class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int len = cardPoints.length;
        int total=0;
        for(int i:cardPoints){
            total+=i;
        }
        int minSum=total;
        for(int i=0;i<=k;i++){
            int sum=0;
            for(int j=i;j<i+len-k;j++){
                sum+=cardPoints[j];
            }
            minSum = Math.min(minSum,sum);
        }
        return total - minSum;
    }
}