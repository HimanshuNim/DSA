class Solution {
    public int sumOfSquares(int[] nums) {

        int n=nums.length;
        int result=0;
        int num=1;

        for(int i=0;i<n;i++){
            if(n%num==0){
                result=result+(nums[i]*nums[i]);
            }
            num++;
        }
        
        return result;
    }
}