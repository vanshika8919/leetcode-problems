class Solution {
    public int maxProduct(int[] nums) {
        int res = 0;
        int l = 0;
        int r = 0;
        int maxres = 0;
        
        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                l = nums[i]-1;
                r = nums[j]-1;
                res = l*r;
                maxres = Math.max(maxres,res);
            }
        }
        return maxres;
    }
}