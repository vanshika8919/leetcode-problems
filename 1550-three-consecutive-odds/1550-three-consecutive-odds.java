class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        
        for(int i=0; i<arr.length; i++)
        {
            int n = arr[i];
            if(n%2 != 0)
            {
                count++;
                if(count == 3)
                {
                    return true;
                }
            }
            else
                count = 0;
        }
        return false;
    }
}