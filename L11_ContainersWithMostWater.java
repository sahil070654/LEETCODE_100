class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int maxWater = 0;
        while(l<r){
            int h = Math.min(height[l],height[r]);
            int w = r-l;
            int curr = h*w;
            maxWater = Math.max(curr,maxWater);
           if(height[l]<height[r]){
            l++;
           }else r--;
        }
        return maxWater;
    }
}
