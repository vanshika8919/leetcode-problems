class Solution {
    public int singleNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]>max)
            {
                max = nums[i];
            }
            if(nums[i]<min)
            {
                min = nums[i];
            }
        }
        int[] count = new int[max-min+1];
        
        for(int i=0; i<nums.length; i++)
        {
            int index = nums[i]-min;
            count[index]++;
        }
        
        for(int i=0; i<nums.length; i++)
        {
            int index = nums[i]-min;
            
            if(count[index] == 1)
            return nums[i];
        }
        return -1;
    }
}