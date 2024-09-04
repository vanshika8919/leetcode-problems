class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hp = new HashMap<>();
        for(int num:nums){
            if(hp.containsKey(num)){
                hp.put(num,hp.get(num)+1);
            }
            else{
                hp.put(num,1);
            }
        }
        for(int num:nums){
            if(hp.get(num)==1){
                return num;
            }
        }
        return -1;
    }
}