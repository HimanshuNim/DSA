class Solution {
    public int maximumWealth(int[][] accounts) {

        int maxWealth=0;

        for(int[] customer:accounts) {
            int currentCus=0;

            for(int bank:customer){
                currentCus+=bank;
            }

            maxWealth=Math.max(currentCus,maxWealth);
        }
        return maxWealth;
    }
}