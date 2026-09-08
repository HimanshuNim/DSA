class Solution {
    public int fib(int n) {
        return fun(n);
    }
    public int fun(int n){
        if(n<=1) {return n;}

        return fun(n-1)+fun(n-2);
    }
}