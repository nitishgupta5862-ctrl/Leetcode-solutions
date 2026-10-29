class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        if(a<b){
            int temp=a;
            a=b;
            b=temp;
        }
        for(int i=1;i<=b;i++){
            if(a%i==0&& b%i==0){
                count++;
            }
        }
        return count;
    }
}