class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        int b=nums.length;
        int[] ar=new int[b];

        for(int i=0;i<nums.length;i++){
            ar[i]=sum_of(nums[i]);
            //System.out.println(ar[i]);
        }


        for(int i=0;i<b;i++){
            if(min>ar[i]){
                min=ar[i];
            }
            System.out.println(min);
        }
        
        return min;
    }
    int sum_of(int a){
        int sum=0;
        while(a>0){
            int n=a%10;
            sum+=n;
            a=a/10;
        }
        //System.out.println(sum);
        return sum;
    }
}