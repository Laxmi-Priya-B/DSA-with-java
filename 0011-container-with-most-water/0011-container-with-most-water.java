class Solution {
    public int maxArea(int[] height) {
        int r = height.length-1;
        int len=0;
        int area=0;
        int l=0;
        int maxArea=0;
        while(l<r){
            int h = Math.min(height[l],height[r]);
            int w = r-l;
            area = h * w;
            maxArea = Math.max(area,maxArea);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
           
        }
        return maxArea;
    }
}