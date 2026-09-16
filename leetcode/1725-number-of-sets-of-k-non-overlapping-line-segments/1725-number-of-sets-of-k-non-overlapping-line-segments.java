class Solution {
    public int numberOfSets(int n, int k) {
        long MOD =1_000_000_007;
        long totalPoints=n+k-1;
        long totalChoices=2*k;

        if(totalChoices>totalPoints) return 0;

        long num=1, den=1;
        for(long i=1;i<=totalChoices;i++) {
            num=(num*(totalPoints-i+1))%MOD;
            den=(den*i)%MOD;
        }
        return(int)(num*modInverse(den,MOD)%MOD);
    }

    private long modInverse(long a,long m){
        return power(a,m-2,m);
    }

    private long power(long x,long y,long m){
        long res=1;
        x%=m;
        while(y>0){
            if((y&1)==1) res=(res*x)%m;
            x=(x*x)%m;
            y>>=1;
        }
        return res;
    }
}