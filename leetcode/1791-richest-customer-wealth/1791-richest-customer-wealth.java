class Solution {
    public int maximumWealth(int[][] accounts) {

        int maxWealth=0;

        for(int i=0;i<accounts.length;i++) {
            int currentCus=0;

            for(int j=0;j<accounts[i].length;j++){
                currentCus+=accounts[i][j];
            }

            maxWealth=Math.max(currentCus,maxWealth);
        }
        return maxWealth;
    }
}