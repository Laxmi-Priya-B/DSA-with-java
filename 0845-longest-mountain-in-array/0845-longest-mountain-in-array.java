class Solution {
    public int longestMountain(int[] arr) {
        int n= arr.length;
        int longest=0;
        int idx=0;

        for(int i=1;i<n-1;i++){
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1] ){
                int left = i-1;
                int right = i+1;

                while(left>0 && arr[left] > arr[left-1]){
                    left--;
                }
                while(right < n-1 && arr[right] > arr[right+1]){
                    right++;
                }
                int length = right-left+1;
                longest = Math.max(longest,length);
            }
        }
        return longest;
        // if(arr.length<2){
        //     return 0;
        // }
        // for(int i=0;i<n-1;i++){
        //     if(longest<arr[i]){
        //         longest = arr[i];
        //         idx = i;
        //     }
        // }
        // int l=0;
        // int r=arr.length-1;
        // int count=2;
        
        // while(l<r){
        //     if(arr[l]<arr[idx] && arr[r]<arr[idx]){
        //         count++;
        //     }
        //     else if(arr[l]>arr[idx] || arr[r]>arr[idx]){
        //         count=0;
        //         break;
        //     }
        //     else{
        //         count=0;
        //         break;
        //     }
        //     l++;
        //     r--;
        // }
        // return count;
    }
}