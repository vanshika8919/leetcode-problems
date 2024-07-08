class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxarea = 0;
        while(l<r)
        {
            int lh = height[l];
            int rh = height[r];
            int min_h = Math.min(lh,rh);
            int width = r-l;
            int area = min_h*width;
            
            if(lh<rh)
            {
                l++;
            }
            else
                r--;
            
            maxarea = Math.max(maxarea,area);
        }
        return maxarea;
    }
}