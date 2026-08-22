class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int mul=1;
        int total=0;
        int temp=n;
        while(temp>0){
            int digit=temp%10;
            sum +=digit;
            mul *=digit;
            temp=temp/10;

        }
        total=sum +mul;
        if(n%total!=0){
          return false;
        }

        return true;
    }
}