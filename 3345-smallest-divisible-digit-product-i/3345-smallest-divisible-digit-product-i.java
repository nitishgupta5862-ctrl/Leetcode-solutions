class Solution {
    public int smallestNumber(int n, int t) {
    //     while(true){
    //     int temp=n;
    //     int ans=1;
    //     while(temp>0){
    //      int digit=temp%10;
    //      ans *=digit;
    //      temp=temp/10;
    //     }
    //     if(ans%t==0){
    //         return n;
    //     }
    //    n++;
    //     }
      while(digitproduct(n)%t!=0){
          n++;
      }
      return n;
    }
    public int digitproduct(int n){
        int product=1;
        while(n>0){
            int digit=n%10;
            product *=digit;
            n=n/10;
        }
        return product;
    }
}