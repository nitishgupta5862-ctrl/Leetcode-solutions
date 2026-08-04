class Solution {
    public int sumSubarrayMins(int[] arr) {
        // long sum=0;
        // long mod=1000000007;
        // for(int i=0;i<arr.length;i++){
        //     int min=arr[i];
        //     for(int j=i;j<arr.length;j++){
        //         min=Math.min(min,arr[j]);
        //         sum =(sum+min)%mod;
        //     }
        // }
        // return (int)sum;
        long sum=0;
        long mod=1000000007;
        Stack<Integer> s=new Stack<>();
        int n=arr.length;
         int nsl[]=new int[arr.length];
         int nsr[]=new int[arr.length];
         for(int i=n-1;i>=0;i--){
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=n;
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(i);
         }
         s=new Stack<>();
         for(int i=0;i<n;i++){
            while(!s.isEmpty()&&arr[s.peek()]>arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=s.peek();
            }
            s.push(i);
         }
         for(int i=0;i<n;i++){
            long left=i-nsl[i];
            long right=nsr[i]-i;
            long contribution=(long)arr[i]*left*right;
            sum =(sum +contribution)%mod;;
         }
         return (int)sum;
    }
}