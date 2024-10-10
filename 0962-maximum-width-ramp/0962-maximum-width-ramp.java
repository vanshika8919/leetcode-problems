class Solution {
    public int maxWidthRamp(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(st.isEmpty() || nums[st.peek()]>nums[i]){
                st.push(i);
            }
        }

        int res=0;

        for(int j=n-1; j>=0; j--){
            while(!st.isEmpty() && nums[st.peek()]<=nums[j]){
                res=Math.max(res,j-st.pop());
            }
        }
        return res;
    }
}