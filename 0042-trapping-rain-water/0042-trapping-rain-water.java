class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int l_max = 0;
        int r_max = 0;
        int res = 0;
        while(left<=right){
            if(height[left] <= height[right]){
                if(height[left] >= l_max){
                    l_max = height[left];
                }
                else{
                    res += l_max - height[left];
                }
                left++;
            }
            else{
                if(height[right] >= r_max){
                    r_max = height[right];
                }
                else{
                    res += r_max - height[right];
                }
                right--;
            }
        }
        return res;
    }
}