class Solution {
    public int fib(int n) {
        // if(n==0||n==1)return n;
        // int fibnm1 =fib(n-1);
        // int fibnm2=fib(n-2);
        // int z=fibnm1+fibnm2;
        // return z;


        //method 2
        int f[]=new int[n+1];
        return solve(n,f);
        
    }
    public int solve(int n,int f[]){
        if(n==0||n==1)return n;

        if(f[n]!=0){
            return f[n];
        }
        return f[n]=solve(n-1,f)+solve(n-2,f);
    }
}