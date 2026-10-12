class Solution {
    public int maxSum(List<Integer> nums, int k) {
        long MOD=1_000_000_007;
        int [] bitCount=new int[32];
        long totalSum=0;

        for(int num:nums){
            for(int i=0;i<32;i++){
                if((num&(1<<i))!=0){
                    bitCount[i]++;
                }
            }
        }

        for(int i=0;i<k;i++){
            long curr=0;
            for(int bit=0;bit<32;bit++){
                if(bitCount[bit]>0){
                    curr |=(1L<<bit);
                    bitCount[bit]--;
                }
            }
            totalSum=(totalSum+(curr*curr)%MOD)%MOD;
        }
        return (int) totalSum;
    }
}