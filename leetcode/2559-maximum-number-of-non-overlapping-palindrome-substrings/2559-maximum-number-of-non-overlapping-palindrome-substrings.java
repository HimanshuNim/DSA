class Solution {
    public int maxPalindromes(String s, int k) {
        int count =0;
        int lastEnd=-1;
        int n=s.length();

        for(int i=0;i<2*n-1;i++) {
            int l=i/2;
            int r=l+(i%2);

            while(l>=0&&r<n&&s.charAt(l)==s.charAt(r)) {
                int len=r-l+1;

                if (len>=k&& l>lastEnd) {
                    count++;
                    lastEnd=r;
                    break;
                }

                if(len>k+1){
                    break;
                }

                l--;
                r++;
            }
        }

        return count;
    }
}