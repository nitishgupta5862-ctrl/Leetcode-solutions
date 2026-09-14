class Solution {
    public int alternateDigitSum(int n) {
        
        int reverse=0;
        while(n>0){
         reverse=reverse*10+n%10;
        n=n/10;
        }
        int sum =0;
        int count=0;
        while(reverse>0){
            int digit=reverse%10;
             if(count%2==0){
                sum +=digit;
             }else{
                sum -=digit;
             }
             count++;
             reverse=reverse/10;
            
        }
        return sum;
    }
}