class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int res = 0;
        int j=0;
        for(int i:arr1){
            while(j < arr2.length && arr2[j] < i-d){
                j++;
            }
            if(j == arr2.length || arr2[j] > i+d){
                res++;
            }
        }
        return res;
    }
}