class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++) {
            int revAlp='z'-s.charAt(i)+1;
            int strPos=i+1;
            sum+= revAlp*strPos;
        }
        return sum;
    }
}