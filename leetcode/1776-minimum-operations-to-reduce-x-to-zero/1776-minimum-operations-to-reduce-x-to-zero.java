class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        int totalSum=0;
        for(int num : nums){
            totalSum+=num;
        }
        int target=totalSum-x;
        if(target<0) return -1;
        if(target==0) return n;

        int cs=0;
        int maxlen=-1;
        int left=0;

        for(int right=0;right<n;right++){
            cs+=nums[right];

            while(cs>target && left<=right){
                cs-=nums[left];
                left++;
            }

            if(cs==target){
                maxlen=Math.max(maxlen,right-left+1);
            }
        }

        return maxlen==-1?-1:n-maxlen;
    }
}