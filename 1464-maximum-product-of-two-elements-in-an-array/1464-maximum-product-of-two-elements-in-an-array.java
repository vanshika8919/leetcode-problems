class Solution {
    public int maxProduct(int[] nums) {
        int res = 0;
        int l = 0;
        int r = 0;
        int maxres = 0;
        int i=0;
        
        while(i<nums.length)
        {
            int j=i+1;
            while(j<nums.length)
            {      
                l = nums[i]-1;
                r = nums[j]-1;
                res = l*r;
                maxres = Math.max(maxres,res);
                j++;
            }
            i++;
        }
        return maxres;
    }
}