class Solution {
    public boolean predictTheWinner(int[] nums) {
       int player1MaxAdv=currentPlayerAdv(nums,0,nums.length-1);
       if(player1MaxAdv>=0){
        return true;
       }else{
        return false;
       }
    }

    private int currentPlayerAdv(int []nums,int left,int right){
        if(left==right) return nums[left];
        int chooseLeft=nums[left]-currentPlayerAdv(nums,left+1,right);
        int chooseRight=nums[right]-currentPlayerAdv(nums,left,right-1);

        return Math.max(chooseLeft,chooseRight);
    }
}