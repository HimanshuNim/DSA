class Solution {
    public String maxSumOfSquares(int num, int sum) {
        
        if(sum<0||(long)num*9<sum){
            return "";
        }

        StringBuilder sb=new StringBuilder();
        int remainingSum=sum;

        for(int i=0;i<num;i++){
            int remainingDigits=num-1-i;
            int maxPossible=remainingSum-remainingDigits*9;
            int cur=Math.min(9,remainingSum);

            if(cur<maxPossible){
                cur=maxPossible;
            }

            sb.append(cur);
            remainingSum-=cur;
        }

        return sb.toString();
        
    }
}