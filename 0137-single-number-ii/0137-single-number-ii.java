class Solution {
    public int singleNumber(int[] nums) {
        int num=0;

        for(int i=0;i<=31;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(cb(nums[j],i)){
                    count++;
                }
            }
            if(count%3!=0){
                num|=1<<i;
            }
        }

        return num;

    }
    boolean cb(int a,int b){
        
        return (a & (1<<b))==(1<<b);
    }
}