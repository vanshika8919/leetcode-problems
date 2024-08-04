import java.util.*;
class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> li = new ArrayList<>();
        
        for(int i=0;i<nums.length;i++)
        {
            int sum =0;
            for(int j=i;j<nums.length;j++){
                sum += nums[j];
                li.add(sum);
            }
        }
        Collections.sort(li);
        int sum1=0;
        for(int i=left-1;i<right;i++){
            sum1 += li.get(i);
        }
        return (int)(sum1 % 1_000_000_007);
    }
}