class Solution {
    public int[] runningSum(int[] nums) {
     int n=nums.length;
     int temp=0;
     int arr[]=new int[n];

     for(int i=0;i<n;i++) {
        temp=temp+nums[i];
        arr[i]=temp;
     } 

     return arr;  
    }
}