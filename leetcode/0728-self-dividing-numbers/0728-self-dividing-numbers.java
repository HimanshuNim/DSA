class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        for(int i=left;i<=right;i++){
            int temp=i;
            while(temp>0) {
                int digit=temp%10;
                if(digit==0||i%digit!=0){
                    break;
                }
                temp/=10;
            }
            if(temp==0){
                result.add(i);
            }
        }
        return result;
    }
}