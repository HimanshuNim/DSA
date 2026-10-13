class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        long[]square = new long[n];

        for(int i=0;i<n;i++){
            long val=nums[i];
            square[i]=val*val;
        }

        Arrays.sort(square);
        long total=0;
        int mid=n/2;
        for(int i=0;i<n;i++){
            if(i<mid){
                total-=square[i];
            }else{
                total+=square[i];
            }
        }

        return total;
    }
}