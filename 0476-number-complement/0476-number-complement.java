class Solution {
    public int findComplement(int num) {
        if(num==0) return 1;
        String str = Integer.toBinaryString(num);
        StringBuilder sb=new StringBuilder(str);
        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            if(ch=='0'){
                sb.setCharAt(i, '1');
            }
            else if(ch=='1'){
                sb.setCharAt(i,'0');
            }
        }
        String str1=sb.toString();
        int res=Integer.parseInt(str1,2);
        return res;
    }
}